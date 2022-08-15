package com.hfad.kotlinlessonseven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Nija", "Kent", "Ili", "Orin", "Mark", "Ula")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("Ila","002001", 20)
        user.name = "JINI"

        for (i in gradeArray.indices) {
            when (gradeArray[i]) {
                in bad -> badArray.add("Плохие оценки: Ученик:${nameArray[i]} - ${gradeArray[i]}")
                in normal -> normalArray.add("Нормальные оценки: Ученик:${nameArray[i]} - ${gradeArray[i]}")
                in nice -> niceArray.add("Нормальные оценки: Ученик:${nameArray[i]} - ${gradeArray[i]}")
                else -> excellentArray.add("Нормальные оценки: Ученик:${nameArray[i]} - ${gradeArray[i]}")

            }
        }

        badArray.forEach { Log.d("MyLog", it) }
        normalArray.forEach { Log.d("MyLog", it) }
        niceArray.forEach { Log.d("MyLog", it) }
        excellentArray.forEach { Log.d("MyLog", it) }
    }
}

