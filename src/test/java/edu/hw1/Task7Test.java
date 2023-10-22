package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    void positive() {
        assertThat(Task7.rotateRight(8, 1))
            .isEqualTo(4);
        assertThat(Task7.rotateLeft(16, 1))
            .isEqualTo(1 );
        assertThat(Task7.rotateLeft(17, 2))
            .isEqualTo(6 );
        assertThat(Task7.rotateRight(8, 4))
            .isEqualTo(8);
        assertThat(Task7.rotateRight(8, 5))
            .isEqualTo(4);
        assertThat(Task7.rotateLeft(8, 5))
            .isEqualTo(1);
    }
}
