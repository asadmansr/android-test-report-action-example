package com.asadmansr.androidtestreportexample.authentication


import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {

    private val emailValidator = EmailValidator()

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(emailValidator.isEmailValid("Name@email.com"))
    }

    @Test
    fun emailValidator_IncorrectEmailSimple_ReturnFalse() {
        Assert.assertFalse(emailValidator.isEmailValid("name.com"))
    }

    @Test
    fun emailValidator_EmptyEmailSimple_ReturnFalse() {
        Assert.assertFalse(emailValidator.isEmailValid(""))
    }
}