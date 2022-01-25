package ru.mugattarov.testkt

fun main(args: Array<String>) {
    val s = "свободаравенствобратство"
//    val s = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
    val charArray = s.toCharArray()
    repeat(10) {
        charArray.shuffle()
        println(String(charArray))
    }
}
