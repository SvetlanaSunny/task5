package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"sgrCounter1 ,200, 300, 3"})
    void sqrCounterParam(String testName, int randeFrom, int rangeUpTo, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCounter(randeFrom, rangeUpTo);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"sgrCounter1 ,800, 2000, 16"})
    void sqrCounterParam1(String testName, int randeFrom, int rangeUpTo, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCounter(randeFrom, rangeUpTo);
        assertEquals(expected, actual);
    }

}