package com.hfad.lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
listView = findViewById(R.id.listView)
        var nameList = ArrayList<String>()
        nameList.add("Иван")
        nameList.add("Серега")
        nameList.add("Павел")
        nameList.add("Толя")
        nameList.add("Коля")
        nameList.add("Зоя")


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)

            listView?.adapter = adapter
        listView?.setOnItemClickListener{}
        }

}