package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private static int count = 0;
    private final static int KAPREKAR_CONST = 6174;

    private Task6() {}

    public static int countK(int n) {
        count++;
        char[] charArray = Integer.toString(n).toCharArray();
        Arrays.sort(charArray);
        String str = new String(charArray);

        int min = Integer.parseInt(str);
        int max = Integer.parseInt((new StringBuilder(str)).reverse().toString());

        int x = max - min;
        if (x != KAPREKAR_CONST) {
            return countK(x);
        } else {
            int res = count;
            count = 0;
            return res;
        }

    }
}
