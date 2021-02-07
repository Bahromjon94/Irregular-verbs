package uz.technickpro.irregularverbs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class VerbAdapter extends BaseAdapter {


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

        word.setText(verbs.get(position).getWord());
        verbOne.setText(verbs.get(position).getV1());
        verbTwo.setText(verbs.get(position).getV2());
        verbThree.setText(verbs.get(position).getV3());

        return convertView;
    }
}
