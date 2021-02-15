package uz.technickpro.irregularverbs.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.util.Log;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.technickpro.irregularverbs.FullInfoActivity;
import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;

public class VerbRecyclerAdapter extends RecyclerView.Adapter<VerbRecyclerAdapter.VerbHolder> {

    private static final String TAG = "VerbRecyclerView";

    private final Context context;
    private final List<Verb> verbs;
    private OnClickListener listener;


    public VerbRecyclerAdapter(Context context, List<Verb> verbs, OnClickListener listener) {
        this.context = context;
        this.verbs = verbs;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VerbHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_verb, parent, false);

        return new VerbHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerbHolder holder, int position) {

        Verb verb = verbs.get(position);

        holder.word.setText(verbs.get(position).getWord());
        holder.v1.setText(verbs.get(position).getV1());
        holder.v2.setText(verbs.get(position).getV2());
        holder.v3.setText(verbs.get(position).getV3());
        holder.addToFav.setImageResource(R.drawable.ic_baseline_bookmark_border_24_red);
        holder.delFromFav.setImageResource(R.drawable.ic_baseline_bookmark_24_red);

        holder.itemView.setOnClickListener(v ->  {
            listener.onItemClick(verb);
        });

        holder.addToFav.setOnClickListener(v -> {
            listener.onFavClick(verb);
        });

        holder.delFromFav.setOnClickListener(v -> {
            listener.onDelClick(verb);
        });

//        holder.addToFav.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                holder.addToFav.setVisibility(View.INVISIBLE);
//                holder.delFromFav.setVisibility(View.VISIBLE);
//
//                Toast.makeText(context, verbs.get(position).getWord() + " " + holder.strAdded, Toast.LENGTH_SHORT).show();
//
//                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was added");
//            }
//        });
//
//        holder.delFromFav.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                holder.delFromFav.setVisibility(View.INVISIBLE);
//                holder.addToFav.setVisibility(View.VISIBLE);
//
//                Toast.makeText(context, verbs.get(position).getWord() + " " + holder.strDel, Toast.LENGTH_SHORT).show();
//
//                Log.d(TAG, "onClick: " + verbs.get(position).getWord() + " was clicked");
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return verbs.size();
    }

    public class VerbHolder extends RecyclerView.ViewHolder {

        private TextView word;
        private TextView v1;
        private TextView v2;
        private TextView v3;
        private ImageView addToFav;
        private ImageView delFromFav;

        private String strAdded, strDel;


        public VerbHolder(@NonNull View itemView) {
            super(itemView);

            word = itemView.findViewById(R.id.item_word_text);
            v1 = itemView.findViewById(R.id.item_verb_one_text);
            v2 = itemView.findViewById(R.id.item_verb_two_text);
            v3 = itemView.findViewById(R.id.item_verb_three_text);
            addToFav = itemView.findViewById(R.id.item_verb_add_bookmark_img);
            delFromFav = itemView.findViewById(R.id.item_verb_added_bookmark_img);

            strAdded = itemView.getResources().getString(R.string.added);
            strDel = itemView.getResources().getString(R.string.deleted);

            Log.d(TAG, "VerbHolder: ");

        }
    }


    public interface OnClickListener {

        void onItemClick(Verb verb);
        void onFavClick(Verb verb);
        void onDelClick(Verb verb);
    }
}
