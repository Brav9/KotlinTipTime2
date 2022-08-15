package com.hfad.kotlincristallball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.kotlincristallball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvWish.setOnClickListener{
            binding.tvWish.text = getWish()
        }
    }

    private fun getWish(): String {
        return resources.getStringArray(R.array.wish)[randomNumber()]
    }

    private fun randomNumber(): Int {
        val size = resources.getStringArray(R.array.wish).size - 1
        return (0..size).random()

    }
}