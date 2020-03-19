package com.asadmansr.androidtestreportexample.authentication

class PasswordValidator {

    private val minLength = 6

    fun isPasswordValid(password: String): Boolean {
        if (password.length < minLength) return false
        return true
    }

    fun isPasswordsEqual(password: String, confirmPassword: String): Boolean {
        return (password == confirmPassword)
    }
}