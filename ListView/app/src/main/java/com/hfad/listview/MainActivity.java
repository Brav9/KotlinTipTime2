package com.hfad.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.theList);
        Log.d(TAG, "onCreate: Started.");

       final ArrayList<String> names = new ArrayList<>();
        names.add("One");
        names.add("Two");
        names.add("Three");
        names.add("Four");
        names.add("Five");

        adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);

        list.setOnClickListener((adapterView, view, i, 1)   {
            Log.d(TAG, "onItemClick: name: " + names.get(i));
            Toast.makeText(MainActivity.this, "You clicked on: " + names.get(i), Toast.LENGTH_SHORT).show();
        });



    }
}