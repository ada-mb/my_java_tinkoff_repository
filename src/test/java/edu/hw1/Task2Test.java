package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    void Positive() {
        assertThat(Task2.countDigits(0))
            .isEqualTo(1);
        assertThat(Task2.countDigits(22))
            .isEqualTo(2);
        assertThat(Task2.countDigits(-22))
            .isEqualTo(2);
        assertThat(Task2.countDigits(1000))
            .isEqualTo(4);
    }
}
