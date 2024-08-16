package br.com.lincolngadea.ms_kotlin_learning

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class SaudacaoController {
    val contador: AtomicLong = AtomicLong()

    @RequestMapping("/saudacao")
    fun saudacao(@RequestParam(
        value = "name",
        defaultValue = "Kotlin"
    ) name: String?
    ): Saudacao{
        return Saudacao(contador.incrementAndGet(), "Olá Mundo $name")
    }
}
