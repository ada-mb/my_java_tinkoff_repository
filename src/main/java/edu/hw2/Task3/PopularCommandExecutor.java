package edu.hw2.Task3;

import edu.hw2.Task3.Managers.ConnectionManager;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() throws ConnectionException {
        try {
            tryExecute("apt update && apt upgrade -y");
        } catch (ConnectionException exception) {
            throw exception;
        }
    }

    void tryExecute(String command) throws ConnectionException {
        Exception cause = null;
        for (int i = 0; i < maxAttempts; i++) {
            try {
                var connection = manager.getConnection();
                connection.execute(command);
                connection.close();
                return;
            } catch (Exception exception) {
                cause = exception;
            } /*так как ловим просто Exception, то ловится и Exception, которое по мнению
            компилятора может выкинуть close, и ConnectionException, которое выкидывает
            connection.execute(command)*/
        }
        throw new ConnectionException("!", cause);
    }
}
