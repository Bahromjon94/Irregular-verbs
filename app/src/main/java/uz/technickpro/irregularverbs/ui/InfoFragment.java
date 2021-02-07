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
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import uz.technickpro.irregularverbs.R;

public class InfoFragment extends Fragment implements View.OnClickListener {

    private TextView txtEmail, txtTg, txtInsta, txtGitHub, txtFb;
    private Intent intent, chooser;

    private Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        txtEmail = root.findViewById(R.id.info_fg_email_text);

        txtEmail.setOnClickListener(this);

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
                intent.putExtra(Intent.EXTRA_SUBJECT, "First");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent, "Send mail");
                startActivity(chooser);
                break;
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}