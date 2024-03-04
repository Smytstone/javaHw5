package ru.netology.services.JavaHw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class vacationCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/calc.csv")
//        @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    public void testNumberOne(int expected, int income, int expence, int threshold) {
        vacationCalcService service = new vacationCalcService();

//        int expected = 3;
        int actual = service.vacationCalc(income, expence, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testNumberTwo() {
//        vacationCalcService service = new vacationCalcService();
//
//        int expected = 2;
//        int actual = service.vacationCalc(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
