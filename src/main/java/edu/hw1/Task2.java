package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static int countDigits(int y) {
        int counter = 1;
        final int minDigit = 9;
        final int divider = 10;
        int x = y;
        if (x < 0) {
            x *= -1;
        }
        while (x > minDigit) {
            x = x / divider;
            counter++;
        }
        return counter;
    }
}
