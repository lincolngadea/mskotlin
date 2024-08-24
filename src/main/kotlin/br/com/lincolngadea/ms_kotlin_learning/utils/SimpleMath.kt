package br.com.lincolngadea.ms_kotlin_learning.utils

import br.com.lincolngadea.ms_kotlin_learning.exceptions.UnsupportedMathOperationException

class SimpleMath {
    fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
    fun subtraction(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
    fun multiplication(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
    fun avarage(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo)/2
    fun division(numberOne: Double, numberTwo: Double): Double{
        if (numberTwo == 0.0)
            throw UnsupportedMathOperationException("Não é possível dividir um valor por 0")
        return numberOne / numberTwo
    }
}