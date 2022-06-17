package com.rulhouse.interfacepractice.farmer.animal

import android.util.Log

class Snake: Reptile(), Predator<Reptile> {
    override fun getName(): String? {
        return this.javaClass.simpleName
    }

    override fun move(destination: String?) {
        Log.d("Test", "${getName()} crawled to $destination")
    }

    override fun drink() {
        Log.d("Test", "${getName()} drink.")
    }

    override fun hunt(animal: Reptile) {
        Log.d("Test", "${this.getName()} hunt a $animal.")
    }
}