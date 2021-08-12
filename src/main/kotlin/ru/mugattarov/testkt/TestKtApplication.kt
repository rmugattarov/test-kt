package ru.mugattarov.testkt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestKtApplication

fun main(args: Array<String>) {
	runApplication<TestKtApplication>(*args)
}
