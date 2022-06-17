package com.rulhouse.interfacepractice.farmer.animal

import android.util.Log

class Tiger: Mammal(), Predator<Mammal> {
    override fun getName(): String? {
        return this.javaClass.simpleName
    }

    override fun move(destination: String?) {
        Log.d("Test", "${getName()} moved to $destination")
    }

    override fun drink() {
        Log.d("Test", "${this.getName()} lower it's head and drink.")
    }

    override fun hunt(animal: Mammal) {
        Log.d("Test", "${this.getName()} hunt a $animal.")
    }
}