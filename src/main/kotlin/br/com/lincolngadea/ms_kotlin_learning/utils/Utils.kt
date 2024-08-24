package br.com.lincolngadea.ms_kotlin_learning.utils

import br.com.lincolngadea.ms_kotlin_learning.exceptions.UnsupportedMathOperationException

fun calculateAverage(numberOne: String?, numberTwo: String?): Double {
    validateNumericInput(numberOne, numberTwo)
    return (NumberConverter.toDouble(numberOne) + NumberConverter.toDouble(numberTwo)) / 2
}

fun divida(numberOne: String?, numberTwo: String?): Double {
    validateNumericInput(numberOne, numberTwo)
    if (NumberConverter.toDouble(numberTwo) == 0.0) throw UnsupportedMathOperationException("Não é possível dividir um valor por 0")
    return NumberConverter.toDouble(numberOne) / NumberConverter.toDouble(numberTwo)
}

fun validateNumericInput(vararg numbers: String?) {
    if (numbers.any { !NumberConverter.isNumeric(it) }) {
        throw UnsupportedMathOperationException("Please set a numeric value")
    }
}