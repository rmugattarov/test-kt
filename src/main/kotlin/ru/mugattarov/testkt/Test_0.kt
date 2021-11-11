package ru.mugattarov.testkt

fun main(args: Array<String>) {
    val b: Boolean? = false
    println(b?.let{if (it) 1 else 0})
}