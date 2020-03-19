package com.asadmansr.androidtestreportexample.authentication

class EmailValidator {

    private val emailRegex = "^[a-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"

    fun isEmailValid(email: String): Boolean {
        return emailRegex.toRegex().matches(email)
    }
}