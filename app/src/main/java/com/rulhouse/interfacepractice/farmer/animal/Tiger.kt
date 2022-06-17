package com.rulhouse.interfacepractice.farmer.animal

import android.util.Log

class Tiger: Mammal() {
    override fun getName(): String? {
        return this.javaClass.simpleName
    }

    override fun move(destination: String?) {
        Log.d("Test", "${getName()} moved to $destination")
    }

    override fun drink() {
        Log.d("Test", "${this.getName()} lower it's head and drink.")
    }
}