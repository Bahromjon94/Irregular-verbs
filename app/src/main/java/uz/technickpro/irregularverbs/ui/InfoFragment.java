package uz.technickpro.irregularverbs.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import uz.technickpro.irregularverbs.R;

public class InfoFragment extends Fragment implements View.OnClickListener {

    private TextView txtEmail, txtTg, txtInsta, txtGitHub, txtFb;
    private Intent intent, chooser;

    private Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        txtEmail = root.findViewById(R.id.info_fg_email_text);
        txtTg = root.findViewById(R.id.info_fg_tg_channel_text);
        txtInsta = root.findViewById(R.id.info_fg_instagram_text);
        txtGitHub = root.findViewById(R.id.info_fg_git_txt);
        txtFb = root.findViewById(R.id.info_fb_text);

        txtEmail.setOnClickListener(this);
        txtFb.setOnClickListener(this);
        txtGitHub.setOnClickListener(this);
        txtInsta.setOnClickListener(this);
        txtTg.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.info_fg_email_text:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {getResources().getString(R.string.email_address)};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.message_subject));
                intent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.message_subject));
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent, getResources().getString(R.string.message_title));
                startActivity(chooser);
                break;

            case R.id.info_fg_tg_channel_text:

                Intent intentT = new Intent();
                intentT.setData(Uri.parse("https://t.me/IT_Junior_uz"));
                intentT.setAction(Intent.ACTION_VIEW);
                startActivity(intentT);
                break;

            case R.id.info_fb_text:
                Intent intentF = new Intent();
                intentF.setData(Uri.parse("https://facebook.com/bahromjon.polat"));
                intentF.setAction(Intent.ACTION_VIEW);
                startActivity(intentF);
                break;

            case R.id.info_fg_git_txt:
                Intent intentG = new Intent();
                intentG.setData(Uri.parse("https://github.com/Bahromjon94"));
                intentG.setAction(Intent.ACTION_VIEW);
                startActivity(intentG);
                break;

            case R.id.info_fg_instagram_text:
                Intent intentI = new Intent();
                intentI.setData(Uri.parse("https://instagram.com/i.m_bahromjon"));
                intentI.setAction(Intent.ACTION_VIEW);
                startActivity(intentI);
                break;
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}