package br.com.lincolngadea.ms_kotlin_learning

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException

@RestController
class SumController {

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw Exception()
            return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }

    private fun convertToDouble(number: String?): Double {
        return 0.0
    }

    private fun isNumeric(numberOne: String?): Boolean {
        return false
    }
}