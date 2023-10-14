package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    private Task2Test(){
    }

    @Test
    @DisplayName("Передача нуля, ожидание 1")
    void Test1() {
        int count = Task2.countDigits(0);
        assertThat(count)
            .isEqualTo(1);
    }
    @Test
    @DisplayName("Передача 22, ожидание 2")
    void Test2() {
        int count = Task2.countDigits(22);
        assertThat(count)
            .isEqualTo(2);
    }
    @Test
    @DisplayName("Передача отрицательного -22, ожидание 2")
    void Test3() {
        int count = Task2.countDigits(-22);
        assertThat(count)
            .isEqualTo(2);
    }
    @Test
    @DisplayName("Передача 1000, ожидание 4")
    void Test4() {
        int count = Task2.countDigits(1000);
        assertThat(count)
            .isEqualTo(4);
    }
}
