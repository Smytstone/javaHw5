package ru.netology.services.JavaHw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class vacationCalcServiceTest {
    @Test
    public void testNumberOne() {
        vacationCalcService service = new vacationCalcService();

        int expected = 3;
        int actual = service.vacationCalc(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberTwo() {
        vacationCalcService service = new vacationCalcService();

        int expected = 2;
        int actual = service.vacationCalc(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
