package edu.hw1;

public class Task4 {
    private Task4() {}

    public static String fixString(String str) {
        char[] symbols = str.toCharArray();
        int length = symbols.length;
        for (int i = 1; i < length; i = i + 2) {
            char c = symbols[i];
            symbols[i] = symbols[i - 1];
            symbols[i - 1] = c;
        }
        String newStr = new String(symbols);
        return newStr;

    }
}
