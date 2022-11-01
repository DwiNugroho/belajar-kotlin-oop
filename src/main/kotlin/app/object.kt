package app

import data.Person

fun main() {
    val ahmad = Person()
    ahmad.firstName = "Ahmad"

    val dimas = Person()
    dimas.firstName = "Dimas"

    val brian = Person()
    brian.firstName = "Dimas"

    println(ahmad.firstName)
    println(dimas.firstName)
    println(brian.firstName)
}