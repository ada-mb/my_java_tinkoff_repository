package edu.project1;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GallowsGameStarter {

    private GallowsGameStarter() {}

    private final static Logger LOGGER = LogManager.getLogger();

    public static void start(int rounds) { //кол-во раун-в контролирует игрок,тем самым выбирая сложность
       GallowsGame game = new GallowsGame(rounds);
       Scanner scanner = new Scanner(System.in);
       char c;
       int mistakes = 0;
       String theWord = "The word: ";
       String youLost = "You lost!";
       //System.out.println("The game begins! If you want to give up, enter 1");
        LOGGER.info("The game begins! If you want to give up, enter 1");
       while (mistakes < rounds) {
           LOGGER.info("Guess a letter (or give up...)");
           c = scanner.next().toLowerCase().charAt(0);
           if (c == '1') {
               LOGGER.info(theWord + new String(game.gamerWord));
               LOGGER.info(youLost);
               return;
           } else if (c >= 'a' && c <= 'z') {
               if (game.checkTheLetter(c)) {
                   LOGGER.info("Hit!");
               } else {
                   mistakes++;
                   LOGGER.info("Missed, mistake " + mistakes + " out of " + rounds);
               }
               LOGGER.info(theWord + new String(game.gamerWord));
               if (game.checkTheWin()) {
                   break;
               }
           } else {
               continue;
           }
       }
        if (game.checkTheWin()) {
            LOGGER.info("You won!");
        } else {
            LOGGER.info(youLost);
        }
    }
}
