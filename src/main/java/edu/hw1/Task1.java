package edu.hw1;

import java.util.Objects;

public class Task1 {
    private Task1() {
    }

    public static long minutesToSeconds(String str) {
        long result = 0;
        final int secondsInMinute = 60; //теперь это неизменяемая константа
        try {
            Objects.requireNonNull(str); //выбросит исключение NullPointerException если str == null
            int strLen = str.length();
            int lastIndexOfColon = str.lastIndexOf(":"); //вернет -1 если не нашел ":"
            if (lastIndexOfColon == -1) {
                return -1;
            }
            int seconds = Integer.parseInt(str.substring(lastIndexOfColon + 1, strLen)); /*substring does
            mm:ss -> ss */
            /*Integer.parseInt(x) выбросит нам исключение NumberFormatException, если х не преобразовывается
            в число  */
            if (seconds >= secondsInMinute) {
                return -1;
            }

            int minutes = Integer.parseInt(str.substring(0, lastIndexOfColon)); //substring does mm:ss -> mm

            if (result != -1) {
                result = minutes * secondsInMinute + seconds;
            }
        } catch (NullPointerException npe) {
            result = -1;
        } catch (NumberFormatException nfe) {
            result = -1;
        }

        return result;

    }
}
