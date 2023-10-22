package edu.hw1;

import java.util.Objects;

public class Task3 {
    private Task3() {}

    public static boolean isNestable(int[] a1, int[] a2) {
        Objects.requireNonNull(a1);
        Objects.requireNonNull(a2);
        return (minA1IsBiggerThanMinA2(a1, a2) && maxA1LessThanMaxA2(a1, a2));
    }

    private static int findMin(int[] a) {
        int lengthA = a.length;
        int minA = a[0];
        for (int i = 1; i < lengthA; i++) {
            if (a[i] < minA) {
                minA = a[i];
            }
        }
        return minA;
    }

    private static int findMax(int[] a) {
        int lengthA = a.length;
        int maxA = a[0];
        for (int i = 1; i < lengthA; i++) {
            if (a[i] > maxA) {
                maxA = a[i];
            }
        }
        return maxA;
    }

    private static boolean minA1IsBiggerThanMinA2(int[] a1, int[] a2) {
        return (findMin(a1) > findMin(a2));

    }

    private static boolean maxA1LessThanMaxA2(int[] a1, int[] a2) {
        return (findMax(a1) < findMax(a2));
    }
}
