package com.example.vitor.contacts;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vitor.contacts.data.ContactsContract.ContactEntry;
import com.example.vitor.contacts.data.ContactsDBHelper;

public class AddContact extends AppCompatActivity{

    private EditText mNameEditText;
    private EditText mPhoneEditText;
    private EditText mEmailEditText;
    private Button newContact;
    //private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_contact);

        mNameEditText = (EditText) findViewById(R.id.add_input_name);
        mPhoneEditText = (EditText) findViewById(R.id.add_input_phone);
        mEmailEditText = (EditText) findViewById(R.id.add_input_email);
        newContact = (Button) findViewById(R.id.add_newcontact_button);

        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                insertContact();
            }
        });
    }

    private void insertContact(){
        // Read from input fields
        // Use trim to eliminate leading or trailing white space
        String nameString = mNameEditText.getText().toString().trim();
        String phoneString = mPhoneEditText.getText().toString().trim();
        String emailString = mEmailEditText.getText().toString().trim();

        // Create database helper

        ContactsDBHelper mDbHelper = new ContactsDBHelper(this);
        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and pet attributes from the editor are the values.
        ContentValues values = new ContentValues();

        values.put(ContactEntry.CONTACTS_COLUMN_NAME, nameString);
        values.put(ContactEntry.CONTACTS_COLUMN_PHONE, phoneString);
        values.put(ContactEntry.CONTACTS_COLUMN_EMAIL, emailString);

        //Armazenar imagem
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        foto.compress(Bitmap.CompressFormat.PNG, 100, baos);
//        byte[] photo = baos.toByteArray();
//        contentValues.put("photo", photo);

        // Insert a new row for pet in the database, returning the ID of that new row.
        long newRowId = db.insert(ContactEntry.TABLE_NAME, null, values);

        // Show a toast message depending on whether or not the insertion was successful
        if (newRowId == -1) {
            // If the row ID is -1, then there was an error with insertion.
            Toast.makeText(this, "Error with saving contact", Toast.LENGTH_SHORT).show();
        } else {
            // Otherwise, the insertion was successful and we can display a toast with the row ID.
            Toast.makeText(this, "contact saved with row id: " + newRowId, Toast.LENGTH_SHORT).show();
        }
    }

}

