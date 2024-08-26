package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearDaysTest {
    @Test
    public void testLeapYearDivisibleBy400() {
        int year = 2000;
        int expectedDays = 366;
        assertEquals(expectedDays, Main.checkingDaysOfTheYear(year), "В 2000 году должно быть 366 дней.");
    }

    @Test
    public void testNonLeapYearDivisibleBy100ButNotBy400() {
        int year = 1900;
        int expectedDays = 365;
        assertEquals(expectedDays, Main.checkingDaysOfTheYear(year), "В 1900 году должно быть 365 дней.");
    }

    @Test
    public void testLeapYearDivisibleBy4ButNotBy100() {
        int year = 2024;
        int expectedDays = 366;
        assertEquals(expectedDays, Main.checkingDaysOfTheYear(year), "В 2024 году должно быть 366 дней.");
    }

    @Test
    public void testNonLeapYearNotDivisibleBy4() {
        int year = 2023;
        int expectedDays = 365;
        assertEquals(expectedDays, Main.checkingDaysOfTheYear(year), "В 2023 году должно быть 365 дней.");
    }
}
