package com.hfad.kotlindrawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.hfad.kotlindrawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item1 -> {
                        Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 -> {}
                    R.id.item3 -> {}
                    R.id.item4 -> {}
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
        }
    }
}