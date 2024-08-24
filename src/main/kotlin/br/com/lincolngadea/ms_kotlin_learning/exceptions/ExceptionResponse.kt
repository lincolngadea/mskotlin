package br.com.lincolngadea.ms_kotlin_learning.exceptions

import java.util.Date

class ExceptionResponse (
    val timestamp: Date,
    val message: String?,
    val details: String
)