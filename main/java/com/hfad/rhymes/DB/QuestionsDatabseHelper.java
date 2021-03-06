package com.hfad.rhymes.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class QuestionsDatabseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME ="questionsBase";
    private static final int DB_VERSION = 1;
    private Cursor cursor;
    public QuestionsDatabseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("CREATE TABLE QUESTIONSTABLE("+ "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +" QUESTIONS TEXT, " +" OPTIONS TEXT," +" ANSWERS TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
