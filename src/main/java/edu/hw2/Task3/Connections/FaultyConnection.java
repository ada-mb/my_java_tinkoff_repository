package edu.hw2.Task3.Connections;

import edu.hw2.Task3.ConnectionException;


public class FaultyConnection implements Connection {
    private static final double MEDIAN_RANDOM = 0.5;

    @Override
    public void execute(String command) throws ConnectionException {
        double x = Math.random(); //возвращает вещественное из [0,1)
        if (x >= MEDIAN_RANDOM) {
            throw new ConnectionException();
        }
    } //может тут лучше выкидывать код возврата, а не исключение???

    @Override
    public void close() {
        //System.out.println("Connection closed.");
    }
}
