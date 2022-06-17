package com.rulhouse.interfacepractice

import android.util.Log

class InterfaceImpl {
    fun impl() {
        val penguin = Penguin()
        val fish: Fish = Penguin()

        Log.d("Test", "--- Penguin ---")
        penguin.walk()
        penguin.swim()

        Log.d("Test", "--- Fish ---")
        fish.swim()

        Log.d("Test", "--- fish as Penguin ---")
        (fish as Penguin).walk()  // 像企鵝一樣的魚，會走路也是很合理的
        (fish as Penguin).swim()  // 因為魚本來就會游泳，

        Log.d("Test", "--- penguin as Fish ---")
        (penguin as Fish).swim()  // 企鵝本來就會游泳
    }
}