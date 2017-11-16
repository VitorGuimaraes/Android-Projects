package com.example.vitor.contacts.data;

import java.util.HashMap;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ContactsDBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "MyDBName.db";
    private static final int DATABASE_VERSION = 1;

    private HashMap hp;

    public ContactsDBHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_CONTACTS_TABLE = "CREATE TABLE" + ContactsContract.ContactEntry.TABLE_NAME + " ("
                + ContactsContract.ContactEntry.CONTACTS_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ContactsContract.ContactEntry.CONTACTS_COLUMN_NAME + " TEXT, "
                + ContactsContract.ContactEntry.CONTACTS_COLUMN_PHONE + " TEXT, "
                + ContactsContract.ContactEntry.CONTACTS_COLUMN_EMAIL + " TEXT, "
                + ContactsContract.ContactEntry.CONTACTS_COLUMN_FOTO + " BLOB);";

        db.execSQL(SQL_CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        Log.w(ContactsDBHelper.class.getName(), "Upgrading database from version " + oldVersion +
                " to " + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS" + ContactsContract.ContactEntry.TABLE_NAME);
        onCreate(db);
    }

}























