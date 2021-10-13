package ru.netology.sqr;

public class SQRService {
    public int borderSqr(int number1, int number2) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= number1 && i * i <= number2) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}