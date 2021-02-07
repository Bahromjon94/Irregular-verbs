package uz.technickpro.irregularverbs.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;
import uz.technickpro.irregularverbs.VerbAdapter;

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
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));
        verbs.add(new Verb(getResources().getString(R.string.be), "Be", "Was, Were", "Been", "[ bi; strong form bi: ]", "Was, Were", "bi:n", "be - bo'lmoq degani"));

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
        Log.d(TAG, "onAttach: was worked");
    }

}