package com.hfad.semaforkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : Activity() {

    var imSemafor: ImageView? = null
    var imButton: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imSemafor = findViewById(R.id.ivSemafor)
        imButton = findViewById(R.id.ivButton)

    }

    fun onClickStartStop(view: View) {

        imSemafor?.setImageResource(R.drawable.semafor_green)
        imButton?.setImageResource(R.drawable.button_stop)
    }
}
