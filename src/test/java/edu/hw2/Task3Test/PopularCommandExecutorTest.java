package edu.hw2.Task3Test;

import edu.hw2.Task3.ConnectionException;
import edu.hw2.Task3.Managers.DefaultConnectionManager;
import edu.hw2.Task3.Managers.FaultyConnectionManager;
import edu.hw2.Task3.PopularCommandExecutor;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;

public class PopularCommandExecutorTest {
    @Test
    void positive() {
        assertThatNoException().isThrownBy(() -> {
            PopularCommandExecutor executor = new PopularCommandExecutor(new DefaultConnectionManager(), 10);
            executor.updatePackages();
        });
    }
    @Test
    void negative() {
        boolean catchException = false;
        PopularCommandExecutor executor = new PopularCommandExecutor(new FaultyConnectionManager(), 1);
        for (int i = 0; i < 10; i++) {
            try {
                executor.updatePackages();
            } catch (ConnectionException exception){
                catchException = true;
                break;
            }
        }
        assertThat(catchException).isEqualTo(true);
    }
}
