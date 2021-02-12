package uz.technickpro.irregularverbs.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class VerbAdapter extends BaseAdapter {

    private static final String TAG = "VerbAdapter";


    Context context;
    List<Verb> verbs;

    public VerbAdapter(Context context, List<Verb> verbs) {
        this.context = context;
        this.verbs = verbs;
    }

    @Override
    public int getCount() {
        return verbs.size();
    }

    @Override
    public Object getItem(int position) {
        return verbs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_verb, parent, false);

        TextView word = convertView.findViewById(R.id.item_word_text);
        TextView verbOne = convertView.findViewById(R.id.item_verb_one_text);
        TextView verbTwo = convertView.findViewById(R.id.item_verb_two_text);
        TextView verbThree = convertView.findViewById(R.id.item_verb_three_text);
        ImageView imgAddToBookmark = convertView.findViewById(R.id.item_verb_add_bookmark_img);
        ImageView imgAddedToBookmark = convertView.findViewById(R.id.item_verb_added_bookmark_img);

        word.setText(verbs.get(position).getWord());
        verbOne.setText(verbs.get(position).getV1());
        verbTwo.setText(verbs.get(position).getV2());
        verbThree.setText(verbs.get(position).getV3());
        imgAddToBookmark.setImageResource(R.drawable.ic_baseline_bookmark_border_24_red);
        imgAddedToBookmark.setImageResource(R.drawable.ic_baseline_bookmark_24_red);


        imgAddToBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAddToBookmark.setVisibility(View.GONE);
                imgAddedToBookmark.setVisibility(View.VISIBLE);

                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was added");
            }
        });


        imgAddedToBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgAddedToBookmark.setVisibility(View.GONE);
                imgAddToBookmark.setVisibility(View.VISIBLE);

                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was deleted");
            }
        });


        return convertView;
    }
}
