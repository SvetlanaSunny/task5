package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqrCounter() {
        SQRService service = new SQRService();
        int expected = 3; // ожидаемый результат
        int actual = service.sqrCounter(200, 300);//фактический результат
        assertEquals(expected, actual);
    }

    @Test
    void sqrCounter1() {
        SQRService service = new SQRService();
        int expected = 16; // ожидаемый результат
        int actual = service.sqrCounter(800, 2000);//фактический результат
        assertEquals(expected, actual);
    }


}