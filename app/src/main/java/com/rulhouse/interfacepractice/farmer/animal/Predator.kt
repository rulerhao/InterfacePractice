package com.rulhouse.interfacepractice.farmer.animal

interface Predator<T> {
    fun hunt(animal: T)
}