package com.rulhouse.interfacepractice.farmer

import android.util.Log
import com.rulhouse.interfacepractice.farmer.animal.Animal




class Farmer {

    fun bringWater(destination: String) {
        Log.d("Test", "Farmer bring water to $destination.")
    }

    fun feedWater(a: Animal) { // polymorphism
        bringWater("Feeding Room")
        a.move("Feeding Room")
        a.drink()
    }

}