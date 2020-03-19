package com.asadmansr.androidtestreportexample.authentication

import org.junit.Assert
import org.junit.Test

class PasswordValidatorTest {

    private val passwordValidator = PasswordValidator()

    @Test
    fun passwordValidator_CorrectPasswordFormat_ReturnsTrue() {
        Assert.assertTrue(passwordValidator.isPasswordValid("password1234"))
    }

    @Test
    fun passwordValidator_IncorrectPasswordFormat_ReturnFalse() {
        Assert.assertFalse(passwordValidator.isPasswordValid("pass"))
    }

    @Test
    fun passwordValidator_EmptyPassword_ReturnFalse() {
        Assert.assertFalse(passwordValidator.isPasswordValid(""))
    }

    @Test
    fun passwordValidator_PasswordsMatch_ReturnTrue() {
        Assert.assertTrue(passwordValidator.isPasswordsEqual("p@ssw0rd!", "p@ssw0rd!"))
    }

    @Test
    fun passwordValidator_PasswordsDoNotMatch_ReturnFalse() {
        Assert.assertFalse(passwordValidator.isPasswordsEqual("p@ssw0rd!", "password"))
    }
}