package ru.netology;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class HamValidationTest {
    @Test
    public void testValidYear() {
        int year = 2023;
        boolean isValid = Main.isValidYear(year);
        assertThat(isValid, is(true));
    }

    @Test
    public void testInvalidYearNegative() {
        int year = -2023;
        boolean isValid = Main.isValidYear(year);
        assertThat(isValid, is(false));
    }

    @Test
    public void testInvalidYearNonInteger() {
        String yearString = "abc";
        assertThrows(NumberFormatException.class, () -> Main.isValidYear(Integer.parseInt(yearString)));
    }

}
