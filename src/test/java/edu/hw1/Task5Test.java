package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    private Task5Test() {}

    @Test
    @DisplayName("Пример 1 из задания")
    void Test1() {
        boolean result = Task5.isPalindromeDescendant(11211230);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Пример 2 из задания")
    void Test2() {
        boolean result = Task5.isPalindromeDescendant(13001120);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Пример 3 из задания")
    void Test3() {
        boolean result = Task5.isPalindromeDescendant(23336014);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Пример 4 из задания")
    void Test4() {
        boolean result = Task5.isPalindromeDescendant(11);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Нечетное колво цифр в числе палиндроме")
    void Test5() {
        boolean result = Task5.isPalindromeDescendant(121);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Нечетное колво цифр в числе непалиндроме")
    void Test6() {
        boolean result = Task5.isPalindromeDescendant(122);
        assertThat(result)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("Число из одной цифры")
    void Test7() {
        boolean result = Task5.isPalindromeDescendant(9);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("ОТрицательное число")
    void Test8() {
        boolean result = Task5.isPalindromeDescendant(-989);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("ОТрицательное число из одной цифры")
    void Test9() {
        boolean result = Task5.isPalindromeDescendant(-9);
        assertThat(result)
            .isEqualTo(true);
    }
}
