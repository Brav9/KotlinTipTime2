package com.hfad.kotlinfishermanhandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nav_view = findViewById<NavigationView>(R.id.nav_view)
        nav_view.setNavigationItemSelectedListener(this)

        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.som, "Coм", "wqf wq32   fi n 44h fb oie E EABA2" ))
        list.add(ListItem(R.drawable.nalim, "Налим", "wqf wq32   fi n 44h fb oie E EABA2" ))
        list.add(ListItem(R.drawable.shuca, "Щука", "wqf wq32   fi n 44h fb oie E EABA2" ))
        list.add(ListItem(R.drawable.caras, "Карась", "wqf wq32   fi n 44h fb oie E EABA2" ))

        var rcView = findViewById<RecyclerView>(R.id.rcView)
        rcView.hasFixedSize()

        rcView.adapter = MyAdapter(list, this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_fish -> Toast.makeText(this,"Id fish", Toast.LENGTH_SHORT).show()
            R.id.id_na -> Toast.makeText(this,"Id na", Toast.LENGTH_SHORT).show()
            R.id.id_sna -> Toast.makeText(this,"Id sna", Toast.LENGTH_SHORT).show()
            R.id.id_history -> Toast.makeText(this,"Id history", Toast.LENGTH_SHORT).show()
        }

        return true
    }


}