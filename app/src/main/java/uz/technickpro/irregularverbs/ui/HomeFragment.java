package uz.technickpro.irregularverbs.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;
import uz.technickpro.irregularverbs.adapter.VerbAdapter;

public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";
    private VerbAdapter adapter;
    private GridView gridView;
    private List<Verb> verbs;
    private Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: worked");

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = root.findViewById(R.id.home_grid_root);
        verbs = new ArrayList<>();
        adapter = new VerbAdapter(context, verbs);
        gridView.setAdapter(adapter);

        verbList();

        Log.d(TAG, "onCreateView: is working");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, "You clicked " + verbs.get(position).getWord(), Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }


    public void verbList() {

        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.beat), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.begin), "Begin", "began", "begun", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.become), "Become", "became", "become", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.bend), "Bend", "bent", "Bent", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.bet), "Bet", "bet", "bet", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.bit), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.blow), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.break1), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.bring), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.broadcast), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.build), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.burst), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.buy), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.catch1), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.choose), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.come), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.cost), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.cut), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.deal), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.dig), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
        Log.d(TAG, "onAttach: was worked");
    }

}