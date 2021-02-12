package uz.technickpro.irregularverbs.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.technickpro.irregularverbs.FullInfoActivity;
import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;

public class VerbRecyclerAdapter extends RecyclerView.Adapter<VerbRecyclerAdapter.VerbHolder> {

    private static final String TAG = "VerbRecyclerView";

    private final Context context;
    private final List<Verb> verbs;

    public VerbRecyclerAdapter(Context context, List<Verb> verbs) {
        this.context = context;
        this.verbs = verbs;
    }

    @NonNull
    @Override
    public VerbHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_verb, parent, false);

        return new VerbHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerbHolder holder, int position) {

        holder.word.setText(verbs.get(position).getWord());
        holder.v1.setText(verbs.get(position).getV1());
        holder.v2.setText(verbs.get(position).getV2());
        holder.v3.setText(verbs.get(position).getV3());
        holder.addToFav.setImageResource(R.drawable.ic_baseline_bookmark_border_24_red);
        holder.delFromFav.setImageResource(R.drawable.ic_baseline_bookmark_24_red);


//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(context, FullInfoActivity.class);
//
//                intent.putExtra("word", verbs.get(position).getWord());
//                intent.putExtra("v1", verbs.get(position).getV1());
//                intent.putExtra("v2", verbs.get(position).getV2());
//                intent.putExtra("v3", verbs.get(position).getV3());
//                intent.putExtra("pronV1", verbs.get(position).getPronV1());
//                intent.putExtra("pronV2", verbs.get(position).getPronV2());
//                intent.putExtra("pronV3", verbs.get(position).getPronV3());
//                intent.putExtra("description", verbs.get(position).getDescription());
//
//
//            }
//        });


        holder.addToFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.addToFav.setVisibility(View.INVISIBLE);
                holder.delFromFav.setVisibility(View.VISIBLE);

                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was added");
            }
        });

        holder.delFromFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.delFromFav.setVisibility(View.INVISIBLE);
                holder.addToFav.setVisibility(View.VISIBLE);

                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was clicked");

            }
        });

    }

    @Override
    public int getItemCount() {
        return verbs.size();
    }

    public class VerbHolder extends RecyclerView.ViewHolder {

        TextView word;
        TextView v1;
        TextView v2;
        TextView v3;
        ImageView addToFav;
        ImageView delFromFav;


        public VerbHolder(@NonNull View itemView) {
            super(itemView);

            word = itemView.findViewById(R.id.item_word_text);
            v1 = itemView.findViewById(R.id.item_verb_one_text);
            v2 = itemView.findViewById(R.id.item_verb_two_text);
            v3 = itemView.findViewById(R.id.item_verb_three_text);
            addToFav = itemView.findViewById(R.id.item_verb_add_bookmark_img);
            delFromFav = itemView.findViewById(R.id.item_verb_added_bookmark_img);

            Log.d(TAG, "VerbHolder: was worked");

        }
    }
}
