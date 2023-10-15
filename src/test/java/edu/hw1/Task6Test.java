package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {

    @Test
    @DisplayName("Пример 1 из задания")
    void Test1() {
        int result = Task6.countK(6621);
        assertThat(result)
            .isEqualTo(5);
    }
    @Test
    @DisplayName("Пример 2 из задания")
    void Test2() {
        int result = Task6.countK(6554);
        assertThat(result)
            .isEqualTo(4);
    }
    @Test
    @DisplayName("Пример 3 из задания")
    void Test3() {
        int result = Task6.countK(1234);
        assertThat(result)
            .isEqualTo(3);
    }

}
