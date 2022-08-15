package com.hfad.kotlinlessonseven

import android.util.Log

class User(var name: String, var id: String, var age: Int) {

    fun addAge(years: Int) {
        age = age.plus(years)
    }

    fun printUserInfo() {
        Log.d("MyLog", "0000")
    }

}