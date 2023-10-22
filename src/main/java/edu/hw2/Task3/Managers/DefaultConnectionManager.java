package edu.hw2.Task3.Managers;

import edu.hw2.Task3.Connections.Connection;
import edu.hw2.Task3.Connections.FaultyConnection;
import edu.hw2.Task3.Connections.StableConnection;

public class DefaultConnectionManager implements ConnectionManager {
    private static final double MEDIAN_RANDOM = 0.5;

    @Override
    public Connection getConnection() {
        double x = Math.random();
        if (x >= MEDIAN_RANDOM) {
            return new FaultyConnection();
        } else {
            return new StableConnection();
        }
    }
}
