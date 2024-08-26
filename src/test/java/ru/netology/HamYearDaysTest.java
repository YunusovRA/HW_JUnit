package ru.netology;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamYearDaysTest {
    @Test
    public void testLeapYearDivisibleBy400() {
        int year = 2000;
        int expectedDays = 366;
        int actualDays = Main.checkingDaysOfTheYear(year);
        assertThat(actualDays, equalTo(expectedDays));
    }

    @Test
    public void testNonLeapYearDivisibleBy100ButNotBy400() {
        int year = 1900;
        int expectedDays = 365;
        int actualDays = Main.checkingDaysOfTheYear(year);
        assertThat(actualDays, equalTo(expectedDays));
    }

    @Test
    public void testLeapYearDivisibleBy4ButNotBy100() {
        int year = 2024;
        int expectedDays = 366;
        int actualDays = Main.checkingDaysOfTheYear(year);
        assertThat(actualDays, equalTo(expectedDays));
    }

    @Test
    public void testNonLeapYearNotDivisibleBy4() {
        int year = 2023;
        int expectedDays = 365;
        int actualDays = Main.checkingDaysOfTheYear(year);
        assertThat(actualDays, equalTo(expectedDays));
    }
}
