package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task0 {
    private final static Logger LOGGER = LogManager.getLogger(); /*final - инициализация только один раз
    (значением по умолчанию при первом обращении к классу), не можем присвоить другой логгер,
    private - нам не нужно, чтобы этот логгер трогали другие,
    static - сколько бы объектов этого класса мы не создали, у них у всех один логгер*/

    public static void write_hello_world_using_logger() { /*статик, чтобы не нужно было определять объект для вызова
    метода, а можно было сразу обращаться от класса*/

        LOGGER.info("Hello world!");
    }
}
