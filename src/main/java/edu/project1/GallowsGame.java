package edu.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class GallowsGame {
    private int rounds;
    private final ArrayList<String> words;
    private final char[] hiddenWord;
    public final int wordSize;
    public char[] gamerWord;


    GallowsGame(int rounds, ArrayList<String> words) {
        this.rounds = rounds;
        this.words = words;
        this.hiddenWord = words.get((int) Math.round(Math.random() * this.words.size())).toCharArray();
        this.wordSize = (new String(hiddenWord)).length();
        this.gamerWord = "*".repeat(wordSize).toCharArray();
    }

    GallowsGame(int rounds) {
        this(rounds, new ArrayList<String>(new HashSet<String>(Arrays.asList("cat", "you", "love", "tree"))));
    }

    boolean checkTheLetter(char c) {
        boolean result = false;
        int i = new String(hiddenWord).indexOf(c);
        //System.out.println("i = " + i);
        if (i != -1) {
            result = true;
            for (int j = i; j < this.wordSize; j++) {
                if (hiddenWord[j] == c) {
                    //System.out.println("I was in gamerWord[j] = c");
                    gamerWord[j] = c;
                }
            }
        }
        return result;
    }

    boolean checkTheWin() {
        return (new String(this.hiddenWord).equals(new String(this.gamerWord)));
    }

}
