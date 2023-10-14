package edu.hw1;

import java.util.Objects;

public class Task1 {

    public static long minutesToSeconds(String str) {
        try {
            Objects.requireNonNull(str); //выбросит исключение NullPointerException если str == null
            long result;
            int strLen = str.length();
            int lastIndexOfColon = str.lastIndexOf(":"); //вернет -1 если не нашел ":"
            if (lastIndexOfColon == -1)
                return -1;
            int seconds = Integer.parseInt(str.substring(lastIndexOfColon + 1, strLen)); /*substring does
            mm:ss -> ss */
            /*Integer.parseInt(x) выбросит нам исключение NumberFormatException, если х не преобразовывается
            в число  */
            if (seconds >= 60)
                return -1;

            int minutes = Integer.parseInt(str.substring(0, lastIndexOfColon)); //substring does mm:ss -> mm

            result = minutes * 60 + seconds;

            return result;
        }
        catch (NullPointerException npe){
            return -1;
        }
        catch (NumberFormatException nfe){
            return -1;
        }

    }
}
