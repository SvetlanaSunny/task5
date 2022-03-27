package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqrCounter() {
        SQRService service = new SQRService();
        int expected = 3; // ожидаемый результат
        int actual = service.sqrCounter(200, 300);//фактический результат
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"sgrCounter1 ,3"})
    void sqrCounterParam(String testName, int expected){
        SQRService service = new SQRService();
        int actual = service.sqrCounter(200,300);
        assertEquals(expected,actual);
    }


}