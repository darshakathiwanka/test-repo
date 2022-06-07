package com.jiat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd = findViewById(R.id.button1);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextFirstName = findViewById(R.id.editTextFName);
                EditText editTextLastName = findViewById(R.id.editTextLName);
                EditText editTextContactNo = findViewById(R.id.editTextPhone);
                EditText editTextEmail = findViewById(R.id.editTextEmail);

                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String contactNo = editTextContactNo.getText().toString();
                String email = editTextEmail.getText().toString();

                Contact contact = new Contact(firstName, lastName, contactNo, email);

                contacts.add(contact);
                Toast.makeText(MainActivity.this,"Contact Added Successfully",Toast.LENGTH_SHORT).show();

                editTextFirstName.setText("");
                editTextLastName.setText("");
                editTextContactNo.setText("");
                editTextEmail.setText("");
            }
        });

        Button buttonView = findViewById(R.id.button2);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ViewContacts.class);
                startActivity(intent);
            }
        });
    }
}