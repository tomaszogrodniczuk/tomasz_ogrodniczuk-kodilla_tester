package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"KowalskiA", "nowak_jan", "muchomorek20", "adam.kornacki", "Anna-Motyl", "_adnRzej6"})
    public void shouldReturnTrueForUsernameMatchingGivenRegex (String username) { //Given regex: "^[a-zA-Z0-9._-]{3,}$"
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna Nowak", "AB", "anna!nowak"})
    public void shouldReturnFalseForUsernameNotMatchingGivenRegex (String username) { //Given regex: "^[a-zA-Z0-9._-]{3,}$"
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna.Nowak@wp.pl", "annanowak@poczta.onet.pl", "JanNowak_20@poczta.pl"})
    public void shouldReturnTrueForEmailMatchingGivenRegex (String email) { //Given regex: "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna nowak@wp.pl", "annanowak.wp.pl", "@wp.pl", "anna.pl", "monika@kowalska", "anna.kowaksa@poczta.onet.domenanowa", "anna.nowak@po czta.onet.pl", " "})
    public void shouldReturnFalseForEmailNotMatchingGivenRegex (String email) { //Given regex: "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNullOrEmpty (String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}