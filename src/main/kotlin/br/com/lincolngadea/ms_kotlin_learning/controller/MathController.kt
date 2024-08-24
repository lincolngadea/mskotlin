package br.com.lincolngadea.ms_kotlin_learning.controller

import br.com.lincolngadea.ms_kotlin_learning.utils.NumberConverter
import br.com.lincolngadea.ms_kotlin_learning.utils.SimpleMath
import br.com.lincolngadea.ms_kotlin_learning.utils.validateNumericInput
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {
    private val math = SimpleMath()

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return math.sum(
            NumberConverter.toDouble(numberOne),
            NumberConverter.toDouble(numberTwo)
        )
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    fun subtract(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return math.subtraction(
            NumberConverter.toDouble(numberOne),
            NumberConverter.toDouble(numberTwo)
        )
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    fun multiply(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return math.multiplication(
            NumberConverter.toDouble(numberOne),
            NumberConverter.toDouble(numberTwo)
        )
    }

    @RequestMapping("/avr/{numberOne}/{numberTwo}")
    fun average(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        return math.avarage(
            NumberConverter.toDouble(numberOne),
            NumberConverter.toDouble(numberTwo)
        )
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    fun divide(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return math.division(
            NumberConverter.toDouble(numberOne),
            NumberConverter.toDouble(numberTwo)
        )
    }
}