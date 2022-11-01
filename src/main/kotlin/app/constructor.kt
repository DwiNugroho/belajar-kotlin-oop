package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(almaz.brand)
}