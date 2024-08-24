package br.com.lincolngadea.ms_kotlin_learning.model

data class Person(
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = "",
)