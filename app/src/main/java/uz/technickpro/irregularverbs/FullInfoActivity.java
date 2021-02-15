package uz.technickpro.irregularverbs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import uz.technickpro.irregularverbs.db.VerbDbHelper;

public class FullInfoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtWord, txtV1, txtV2, txtV3;
    private TextView txtPronV1, txtPronV2, txtPronV3;
    TextView txtDescription;
    ImageView imgChoose, imgChosen;

    private String word, v1, v2, v3, pronV1, pronV2, pronV3, description;

    private VerbDbHelper db;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_info);

        txtWord = findViewById(R.id.full_info_l_word_text);
        txtV1 = findViewById(R.id.full_info_l_v1_text);
        txtV2 = findViewById(R.id.full_info_l_v2_text);
        txtV3 = findViewById(R.id.full_info_l_v3_text);
        txtPronV1 = findViewById(R.id.full_info_l_v1_pron_text);
        txtPronV2 = findViewById(R.id.full_info_l_v2_pron_text);
        txtPronV3 = findViewById(R.id.full_info_l_v3_pron_text);
        txtDescription = findViewById(R.id.full_info_l_description);
        imgChosen = findViewById(R.id.full_info_l_chosen_img);
        imgChoose = findViewById(R.id.full_info_l_choose_img);

        db = new VerbDbHelper(this);
        bundle = getIntent().getExtras();

        word = bundle.getString("word");
        v1 = bundle.getString("v1");
        v2 = bundle.getString("v2");
        v3 = bundle.getString("v3");
//        pronV1 = bundle.getString("pronV1");
//        pronV2 = bundle.getString("pronV2");
//        pronV3 = bundle.getString("pronV3");
//        description = bundle.getString("description");

        txtWord.setText(word);
        txtV1.setText(v1);
        txtV2.setText(v2);
        txtV3.setText(v3);
//        txtPronV1.setText(pronV1);
//        txtPronV2.setText(pronV2);
//        txtPronV3.setText(pronV3);
//        txtDescription.setText(description);


        imgChoose.setOnClickListener(this);
        imgChosen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.full_info_l_choose_img:
                imgChoose.setVisibility(View.INVISIBLE);
                imgChosen.setVisibility(View.VISIBLE);
                Toast.makeText(this, word + " tanlanganlarga qo'shildi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.full_info_l_chosen_img:
                imgChosen.setVisibility(View.INVISIBLE);
                imgChoose.setVisibility(View.VISIBLE);
                Toast.makeText(this, word + " tanlanganlardan olindi", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}