package br.com.lincolngadea.ms_kotlin_learning.utils

import br.com.lincolngadea.ms_kotlin_learning.exceptions.UnsupportedMathOperationException

fun convertToDouble(strNumber: String?): Double {
    if (strNumber.isNullOrBlank()) return 0.0
    val number = strNumber.replace(",", ".")
    return if (isNumeric(number)) number.toDouble() else 0.0
}

fun isNumeric(strNumber: String?): Boolean {
    if (strNumber.isNullOrBlank()) return false
    val number = strNumber.replace(",", ".")
    return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
}

fun calculateAverage(numberOne: String?, numberTwo: String?): Double {
    validateNumericInput(numberOne, numberTwo)
    return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2
}

fun divida(numberOne: String?, numberTwo: String?): Double {
    validateNumericInput(numberOne, numberTwo)
    if (convertToDouble(numberTwo) == 0.0) throw UnsupportedMathOperationException("Não é possível dividir um valor por 0")
    return convertToDouble(numberOne) / convertToDouble(numberTwo)
}

fun validateNumericInput(vararg numbers: String?) {
    if (numbers.any { !isNumeric(it) }) {
        throw UnsupportedMathOperationException("Please set a numeric value")
    }
}