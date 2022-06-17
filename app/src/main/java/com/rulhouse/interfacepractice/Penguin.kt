package com.rulhouse.interfacepractice

import android.util.Log

class Penguin: Fish {

    fun walk() {
        Log.d( "Test", "Eat")
    }

    override fun swim() {
        Log.d("Test", "Swim")
    }

}