package com.rulhouse.interfacepractice.farmer.animal

abstract class Animal {
    abstract fun getName(): String?
    abstract fun move(destination: String?)
    abstract fun drink()
}