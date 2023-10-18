package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    void Positive() {
        assertThat(Task1.minutesToSeconds("13:56"))
            .isEqualTo(836);
        assertThat(Task1.minutesToSeconds("1:1"))
            .isEqualTo(61);
    }
    @Test
    void Negative() {
        assertThat(Task1.minutesToSeconds("00:599"))
            .isEqualTo(-1);
        assertThat(Task1.minutesToSeconds("13:6573:22840"))
            .isEqualTo(-1);
        assertThat(Task1.minutesToSeconds("abcd:ddd"))
            .isEqualTo(-1);
        assertThat(Task1.minutesToSeconds("33"))
            .isEqualTo(-1);
        assertThat(Task1.minutesToSeconds(""))
            .isEqualTo(-1);
    }
}
