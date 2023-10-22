package edu.hw1;

public class Task7 {
    private Task7() {}

    public static int rotateRight(int n, int shift) { //n-целое положительное, shift - считаем целое неотрицательное
        if (!(n > 0 && shift >= 0)) {
            return -1;
        }
        char[] digits = Integer.toBinaryString(n).toCharArray();

        int lengthDigits = digits.length;

        int myShift = shift % lengthDigits;

        char[] newDigits = new char[lengthDigits];

        for (int i = 0; i < lengthDigits; i++) {
            newDigits[((i + myShift) % lengthDigits)] = digits[i];
        }

        return Integer.parseInt(new String(newDigits), 2);
    }

    public static int rotateLeft(int n, int shift) { //n-целое положительное, shift - считаем целое неотрицательное
        if (!(n > 0 && shift >= 0)) {
            return -1;
        }
        char[] digits = Integer.toBinaryString(n).toCharArray();

        int lengthDigits = digits.length;

        int myShift = shift % lengthDigits;

        char[] newDigits = new char[lengthDigits];

        for (int i = 0; i < lengthDigits; i++) {
            newDigits[((i + lengthDigits - myShift) % lengthDigits)] = digits[i];
        }

        return Integer.parseInt(new String(newDigits), 2);
    }
}
