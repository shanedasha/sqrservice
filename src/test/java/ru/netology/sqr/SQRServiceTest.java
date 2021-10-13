package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldBorderSqr() {
        SQRService service = new SQRService();
        int number1 = 200;
        int number2 = 300;
        int expected = 3;

        int actual = service.borderSqr(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBorderSqr2() {
        SQRService service = new SQRService();
        int number1 = 199;
        int number2 = 301;
        int expected = 3;

        int actual = service.borderSqr(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBorderSqr3() {
        SQRService service = new SQRService();
        int number1 = 198;
        int number2 = 302;
        int expected = 3;

        int actual = service.borderSqr(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBorderSqr4() {
        SQRService service = new SQRService();
        int number1 = 260;
        int number2 = 300;
        int expected = 1;

        int actual = service.borderSqr(number1, number2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBorderSqr5() {
        SQRService service = new SQRService();
        int number1 = 190;
        int number2 = 195;
        int expected = 0;

        int actual = service.borderSqr(number1, number2);

        assertEquals(expected, actual);
    }
}



