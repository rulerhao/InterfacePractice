package com.rulhouse.interfacepractice.farmer.animal

import android.util.Log

class Rabbit: Mammal() {
    override fun getName(): String? {
        return this.javaClass.simpleName
    }

    override fun move(destination: String?) {
        Log.d("Test", "${getName()} jumped to $destination")
    }

    override fun drink() {
        Log.d("Test", "${getName()} put out it's tongue and drink.")
    }
}