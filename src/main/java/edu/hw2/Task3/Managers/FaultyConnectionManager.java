package edu.hw2.Task3.Managers;

import edu.hw2.Task3.Connections.FaultyConnection;

public class FaultyConnectionManager implements ConnectionManager {
    @Override
    public FaultyConnection getConnection() {
        return new FaultyConnection();
    }
}
