package com.example.vitor.contacts.data;

import android.provider.BaseColumns;

public class ContactsContract {

    private ContactsContract(){}

    public static final class ContactEntry implements BaseColumns{

        public static final String TABLE_NAME = "contacts";

        public static final String CONTACTS_COLUMN_ID = "id";
        public static final String CONTACTS_COLUMN_NAME = "name";
        public static final String CONTACTS_COLUMN_PHONE = "phone";
        public static final String CONTACTS_COLUMN_EMAIL = "email";
        public static final String CONTACTS_COLUMN_FOTO = "foto";
    }
}
