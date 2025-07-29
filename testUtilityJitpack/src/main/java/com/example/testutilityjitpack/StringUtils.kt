package com.example.testutilityjitpack

object StringUtils {
    fun capitalizeWords(input: String): String =
        input.split(" ").joinToString(" ") { it.capitalize() }
}