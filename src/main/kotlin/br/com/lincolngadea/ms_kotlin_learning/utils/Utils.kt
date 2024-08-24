package br.com.lincolngadea.ms_kotlin_learning.utils

import br.com.lincolngadea.ms_kotlin_learning.exceptions.UnsupportedMathOperationException

fun validateNumericInput(vararg numbers: String?) {
    if (numbers.any { !NumberConverter.isNumeric(it) }) {
        throw UnsupportedMathOperationException("Please set a numeric value")
    }
}