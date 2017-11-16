package com.example.vitor.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vitor.contacts.data.ContactsDBHelper;

public class MainActivity extends AppCompatActivity {

    private ContactsDBHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button addContact = (Button) findViewById(R.id.add_button);
        Button deleteContact = (Button) findViewById(R.id.delete_button);
        Button editContact = (Button) findViewById(R.id.edit_button);

        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, AddContact.class);
                startActivity(intent);
            }
        });

        mDbHelper = new ContactsDBHelper(this);

        //Faltam os metodos pra ir pra activity do delete e do edit
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}























