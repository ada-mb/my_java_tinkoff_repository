package edu.hw1;

public class Task2 {
    private static final int MAX_DIGIT = 9;
    private static final int DIVIDER = 10;

    private Task2() {
    }

    public static int countDigits(int y) {
        int counter = 1;
        int x = Math.abs(y);
        while (x > MAX_DIGIT) {
            x = x / DIVIDER;
            counter++;
        }
        return counter;
    }
}
