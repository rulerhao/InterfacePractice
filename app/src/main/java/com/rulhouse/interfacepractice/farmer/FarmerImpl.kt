package com.rulhouse.interfacepractice.farmer

import com.rulhouse.interfacepractice.farmer.animal.Rabbit
import com.rulhouse.interfacepractice.farmer.animal.Snake

class FarmerImpl {
    val farmer = Farmer()
    val rabbit = Rabbit()
    val snake = Snake()

    fun impl() {
        farmer.bringWater("My House")
        farmer.feedWater(rabbit)
        farmer.feedWater(snake)
        rabbit.drink()
    }
}