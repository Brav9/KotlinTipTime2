package com.hfad.cardviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mListView = (ListView) findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();
        list.add(new Card("@drawable://" + R.drawable.a1, "A1"));
        list.add(new Card("@drawable://" + R.drawable.a2, "A2"));
        list.add(new Card("@drawable://" + R.drawable.a3, "A3"));
        list.add(new Card("@drawable://" + R.drawable.a4, "A4"));
        list.add(new Card("@drawable://" + R.drawable.a5, "A5"));
        list.add(new Card("@drawable://" + R.drawable.a6, "A6"));
        list.add(new Card("@drawable://" + R.drawable.a7, "A7"));
        list.add(new Card("@drawable://" + R.drawable.a8, "A8"));
        list.add(new Card("@drawable://" + R.drawable.a9, "A9"));
        list.add(new Card("@drawable://" + R.drawable.a10, "A10"));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_main, list);
        mListView.setAdapter(adapter);

    }
}