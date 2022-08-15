package com.hfad.lesone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var text: String = "Сегодня утром <всё было хорошо><!> А завтра <будет> ещё <лучше>."
    private var tvText: TextView? = null
    private var tvTextTwo: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvNumber)
        tvTextTwo = findViewById(R.id.tvNumberTwo)

        var counter: Int = 0

        for (n in text.indices) {
            if (text[n] == '<') counter++
        }

        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPCounter: Int = 0
        var endPCounter: Int = 0

        for (n in text.indices) {
            if (text[n] == '<') {
                startPosition[startPCounter] = n
                startPCounter++
            }
            if (text[n] == '>') {
                endPosition[endPCounter] = n
                endPCounter++
            }
        }
        var textFountArray = Array(counter) { "" }
        for (n in startPosition.indices) {
            textFountArray[n] = text.substring(startPosition[n] + 1, endPosition[n])
            Log.d("MyLog", "Text from n :" + textFountArray[n])
        }

//        var subText: String = text.substringAfter('<')
//        var subTextTwo: String = subText.substringBefore('>')
//        var subTwoText: String = text.substringAfter('c')
//        var subTwoTextTwo: String = subTwoText.substringBefore('<')

    }
}