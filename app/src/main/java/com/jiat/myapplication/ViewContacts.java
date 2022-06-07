package com.jiat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ViewContacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contacts);

        ContactAdapter adapter = new ContactAdapter(this, MainActivity.contacts);
        ListView listView = findViewById(R.id.listViewContacts);
        listView.setAdapter(adapter);
    }
}