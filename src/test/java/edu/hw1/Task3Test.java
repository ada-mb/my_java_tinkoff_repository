package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    private Task3Test() {}

    @Test
    @DisplayName("Пример 1 из задания")
    void Test1() {
        int[] a1 = new int[] {1, 2, 3, 4};
        int[] a2 = new int[] {0, 6};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Пример 2 из задания")
    void Test2() {
        int[] a1 = new int[] {3, 1};
        int[] a2 = new int[] {4, 0};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("Пример 3 из задания")
    void Test3() {
        int[] a1 = new int[] {9, 9, 8};
        int[] a2 = new int[] {8, 9};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("Пример 4 из задания")
    void Test4() {
        int[] a1 = new int[] {1, 2, 3, 4};
        int[] a2 = new int[] {2, 3};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("Массивы из 1 элемента")
    void Test5() {
        int[] a1 = new int[] {1};
        int[] a2 = new int[] {2};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("Массивы из 1 элемента")
    void Test6() {
        int[] a1 = new int[] {2};
        int[] a2 = new int[] {1};
        boolean result = Task3.isNestable(a1, a2);
        assertThat(result)
            .isEqualTo(false);
    }
}

