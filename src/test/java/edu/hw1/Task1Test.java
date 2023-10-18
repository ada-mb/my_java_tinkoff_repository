package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class Task1Test {
    @Test
    void positive() {
        assertThat(Task1.minutesToSeconds("13:56"))
            .isEqualTo(836);
        assertThat(Task1.minutesToSeconds("1:1"))
            .isEqualTo(61);
    }
    @Test
    void negative() {
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

        assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(()->{
                Task1.minutesToSeconds(null);
            });
    }
}
