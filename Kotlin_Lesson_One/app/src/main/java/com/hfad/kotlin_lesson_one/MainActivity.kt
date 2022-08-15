package com.hfad.kotlin_lesson_one

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var text: String =
        "Что <с этой> суммой <делать>, <есть ли> <какие> <нибудь> <предложения>?"
    private var tvText: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.helloWorld)
        var subString: String = text.substringAfter('<')
        var subText: String = subString.substringBefore('>')
        var counter: Int = 0

//        var startNumber = Array(3) {}
//        var startNumber : Array<Int> = arrayOf(2,4,6,8)
//        var number: Int = startNumber[0]
//        startNumber[3] = 9
//
//        var startNumber = IntArray(3) {3}


        for (n in text.indices) {
            if (text.get(n) == '<') counter++
        }

        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPCounter: Int = 0
        var endPCounter: Int = 0
        for (n in text.indices) {
            if (text.get(n) == '<') {
               startPosition[startPCounter] = n
                startPCounter++
            }
            if (text.get(n) == '>') {
                endPosition[endPCounter] = n
                endPCounter++
            }
        }
        var textFoundArray = Array(counter) {""}
        for (n in   startPosition.indices)
        {
            textFoundArray[n] = text.substring(startPosition[n] + 1, endPosition[n])
            Log.d("MyLog", "Text from n : " + textFoundArray[n])
        }

        tvText?.setText(counter.toString())
    }
}