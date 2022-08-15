package com.hfad.listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        ListView mListView = (ListView) findViewById(R.id.listView);

        Person one = new Person("One", "12-20-1999", "Male", "drawable://" + R.drawable.ic_baseline_record_voice_over_24);
        Person one1 = new Person("One1", "22-08-1999", "Female", "drawable://" + R.drawable.ic_baseline_pregnant_woman_24);
        Person one2 = new Person("One2", "11-03-1999", "Male", "drawable://" + R.drawable.ic_baseline_rowing_24);
        Person one3 = new Person("One3", "06-02-1999", "Female", "drawable://" + R.drawable.ic_baseline_self_improvement_24);
        Person one4 = new Person("One4", "02-05-2000", "Male", "drawable://" + R.drawable.eeee);
        Person one5 = new Person("One5", "06-10-1999", "Male", "drawable://" + R.drawable.qq);
        Person one6 = new Person("One6", "18-11-1999", "Male", "drawable://" + R.drawable.ww);
        Person one7 = new Person("One7", "12-20-1999", "Female", "drawable://" + R.drawable.eew);
        Person one8 = new Person("One8", "12-20-2000", "Female", "drawable://" + R.drawable.ic_baseline_accessibility_new_24);
        Person one9 = new Person("One9", "14-20-1999", "Male", "drawable://" + R.drawable.dd);
        Person one10 = new Person("One10", "12-11-1999", "Male", "drawable://" + R.drawable.ic_baseline_accessibility_new_24);
        Person one11 = new Person("One11", "28-20-1999", "Female", "drawable://" + R.drawable.ww);
        Person one12 = new Person("One12", "23-20-1979", "Female", "drawable://" + R.drawable.qq);
        Person one13 = new Person("One13", "01-07-1999", "Male", "drawable://" + R.drawable.ic_baseline_accessibility_new_24);
        Person one14 = new Person("One14", "09-01-1989", "Male", "drawable://" + R.drawable.ic_baseline_rowing_24);
        Person one15 = new Person("One15", "15-02-1999", "Male", "drawable://" + R.drawable.ic_baseline_pregnant_woman_24);
        Person one16 = new Person("One16", "14-20-1998", "Female", "drawable://" + R.drawable.eew);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(one);
        peopleList.add(one1);
        peopleList.add(one2);
        peopleList.add(one3);
        peopleList.add(one4);
        peopleList.add(one5);
        peopleList.add(one6);
        peopleList.add(one7);
        peopleList.add(one8);
        peopleList.add(one9);
        peopleList.add(one10);
        peopleList.add(one11);
        peopleList.add(one12);
        peopleList.add(one13);
        peopleList.add(one14);
        peopleList.add(one15);
        peopleList.add(one16);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);








    }
}