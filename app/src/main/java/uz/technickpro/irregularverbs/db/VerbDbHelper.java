package uz.technickpro.irregularverbs.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

import uz.technickpro.irregularverbs.Verb;

public class VerbDbHelper extends SQLiteOpenHelper {

    private Context context;
    private List<Verb> verbs;
    private SQLiteDatabase db;

    private static final String DATABASE_NAME = "verb_database.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_VERB = "verb";


    private static final boolean KEY_IS_ADDED = false;

    public VerbDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
