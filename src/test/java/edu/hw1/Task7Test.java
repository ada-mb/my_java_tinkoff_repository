package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    private Task7Test() {}

    @Test
    @DisplayName("Пример 1 из задания")
    void Test1() {
        int result = Task7.rotateRight(8, 1);
        assertThat(result)
            .isEqualTo(4);
    }
    @Test
    @DisplayName("Пример 2 из задания")
    void Test2() {
        int result = Task7.rotateLeft(16, 1);
        assertThat(result)
            .isEqualTo(1 );
    }
    @Test
    @DisplayName("Пример 3 из задания")
    void Test3() {
        int result = Task7.rotateLeft(17, 2);
        assertThat(result)
            .isEqualTo(6 );
    }
    @Test
    @DisplayName("Полный цикл")
    void Test4() {
        int result = Task7.rotateRight(8, 4);
        assertThat(result)
            .isEqualTo(8);
    }
    @Test
    @DisplayName("Полный цикл + 1 для вправо")
    void Test5() {
        int result = Task7.rotateRight(8, 5);
        assertThat(result)
            .isEqualTo(4);
    }
    @Test
    @DisplayName("Полный цикл + 1 для влево")
    void Test6() {
        int result = Task7.rotateLeft(8, 5);
        assertThat(result)
            .isEqualTo(1);
    }
}
