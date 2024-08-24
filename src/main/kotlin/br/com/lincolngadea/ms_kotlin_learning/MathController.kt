package br.com.lincolngadea.ms_kotlin_learning

import br.com.lincolngadea.ms_kotlin_learning.utils.*
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    fun subtract(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return convertToDouble(numberOne) - convertToDouble(numberTwo)
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    fun multiply(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return convertToDouble(numberOne) * convertToDouble(numberTwo)
    }

    @RequestMapping("/avr/{numberOne}/{numberTwo}")
    fun average(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        return calculateAverage(numberOne, numberTwo)
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    fun divide(
        @PathVariable numberOne: String?,
        @PathVariable numberTwo: String?
    ): Double {
        validateNumericInput(numberOne, numberTwo)
        return divida(numberOne, numberTwo)
    }
}