package edu.hw2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {
        LOGGER.info("Hi");

        /*
        Square square = new Square(5);
        LOGGER.info("Square Heigh: " + square.height);
        LOGGER.info("Square Width: " + square.width);

        Rectangle rect = square;
        LOGGER.info("Rectangle Heigh: " + rect.height);
        LOGGER.info("Rectangle Width: " + rect.width);*/
    }
}
