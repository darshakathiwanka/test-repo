package com.jiat.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private ArrayList<Contact> contacts;

    public ContactAdapter(@NonNull Context context, ArrayList<Contact> contacts) {
        super(context, R.layout.contact_item,contacts);

        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Contact contact = contacts.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contact_item,parent,false);
        TextView textViewLetter = view.findViewById(R.id.textViewLetter);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewEmail = view.findViewById(R.id.textViewEmail);
        TextView textViewContact = view.findViewById(R.id.textViewContact);

        textViewLetter.setText(contact.getFirstName().charAt(0));
        textViewName.setText(contact.getFirstName() + " " + contact.getLastName());
        textViewEmail.setText(contact.getEmail());
        textViewContact.setText(contact.getContactNo());

        return view;
    }
}
