package ru.mugattarov.testkt.yndx

import java.nio.file.Files
import java.nio.file.Paths
import kotlin.math.min

fun main(args: Array<String>) {
    println(sum(0, Files.readAllLines(Paths.get("input.txt"))[0], 0, 0))
}

fun sum(i: Int, input: String, reg: Int, sum: Int): Int {
    if (i == input.length) {
        return sum
    }
    val c = input[i]
    return if ((c.isLowerCase() && reg == 0) || (c.isUpperCase() && reg == 1) || c == ' ') {
        sum(i + 1, input, reg, sum + 1)
    } else {
        min(sum(i + 1, input, reg, sum + 2), sum(i + 1, input, reg.let { if (it == 0) 1 else 0 }, sum + 3))
    }
}

fun readInputString(): String {
    val sb = StringBuilder()
    var c = readChar(System.`in`.read())
    while (c.isLetter() || c == ' ') {
        sb.append(c)
        c = readChar(System.`in`.read())
    }
    return sb.toString()
}

private fun readChar(b: Int): Char {
    return b.let { if (b >= Char.MIN_VALUE.toInt() && b <= Char.MAX_VALUE.toInt()) b.toChar() else '$' }
}
