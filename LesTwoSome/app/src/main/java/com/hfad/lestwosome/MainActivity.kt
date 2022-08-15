package com.hfad.lestwosome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickStart(view: View) {
        var intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(
                "some",
                "That shit easy for me!"
            )
        }
        startActivity(intent)
    }

}