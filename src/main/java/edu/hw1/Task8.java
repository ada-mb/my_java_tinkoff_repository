package edu.hw1;


public class Task8 {
    private Task8() {}

    private static final int LEN = 8;
    private static final int MINUS2 = -2;

    private static boolean fight(int i, int j, int y, int x, int[][] arr) {
        int i1 = i + y;
        int j1 = j + x;
        return (i1 >= 0 && i1 < LEN && j1 >= 0 && j1 < LEN && arr[i1][j1] == 1);
    }

    private static boolean fight(int i, int j, int[][] arr) {
        return (fight(i, j, 2, 1, arr)
                || fight(i, j, 1, 2, arr)
                || fight(i, j, MINUS2, -1, arr)
                || fight(i, j, -1, MINUS2, arr)
                || fight(i, j, MINUS2, 1, arr)
                || fight(i, j, -1, 2, arr)
                || fight(i, j, 2, -1, arr)
                || fight(i, j, 1, MINUS2, arr));

    }

    public static boolean knightBoardCapture(int[][] arr) {

        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (arr[i][j] == 1 && fight(i, j, arr)) {
                    return false;
                }
            }
        }
        return true;
    }
}
