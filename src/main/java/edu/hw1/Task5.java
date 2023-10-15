package edu.hw1;

public class Task5 {
    private Task5() {}

    private static boolean isPalindrome(char[] chars) {
        int lengthCharsInNumber = chars.length;
        int j = lengthCharsInNumber - 1; //для итерации по массиву с конца
        for (int i = 0; i < lengthCharsInNumber / 2; i++) {
            if (chars[i] != chars[j]) {
                return false;
            }
            j--;
        }
        return true;
    }

    private static char[] newItterationNumber(char[] chars) {
        String str = new String();
        int len = chars.length;
        for (int i = 1; i < len; i += 2) {
            int x = (chars[i - 1] - '0') + (chars[i] - '0');
            str += Integer.toString(x);
        }
        if (len % 2 == 1) { //если нечет len добавляем последний элемент массива в строку пр. {1,2,2} -> 32
            int x = chars[len - 1] - '0';
            str += x;
        }
        return str.toCharArray();
    }

    public static boolean isPalindromeDescendant(int inputNumber) {
        int number = (inputNumber >= 0) ? inputNumber : (-1) * inputNumber;
        char[] charsInNumber = Integer.toString(number).toCharArray();

        if (charsInNumber.length == 1) {
            return true;
        }
        while (charsInNumber.length > 1) {
            if (isPalindrome(charsInNumber)) {
                return true;
            } else {
                charsInNumber = newItterationNumber(charsInNumber);
            }
        }
        return false;
    }
}
