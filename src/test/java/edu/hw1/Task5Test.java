package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    void Positive() {
        assertThat(Task5.isPalindromeDescendant(11211230))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(13001120))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(23336014))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(11))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(121))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(122))
            .isEqualTo(false);
        assertThat(Task5.isPalindromeDescendant(9))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(-989))
            .isEqualTo(true);
        assertThat(Task5.isPalindromeDescendant(-9))
            .isEqualTo(true);
    }
}
