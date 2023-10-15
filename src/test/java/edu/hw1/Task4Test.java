package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    private Task4Test() {}

    @Test
    @DisplayName("Пример 1 из задания")
    void Test1() {
        String result = Task4.fixString("123456");
        assertThat(result)
            .isEqualTo("214365");
    }
    @Test
    @DisplayName("Пример 2 из задания")
    void Test2() {

        String result = Task4.fixString("hTsii  s aimex dpus rtni.g");
        assertThat(result)
            .isEqualTo("This is a mixed up string.");
    }
    @Test
    @DisplayName("Пример 3 из задания")
    void Test3() {

        String result = Task4.fixString("badce");
        assertThat(result)
            .isEqualTo("abcde");
    }
    @Test
    @DisplayName("Пустая строка")
    void Test4() {
        String str = new String();
        String result = Task4.fixString(str);
        assertThat(result)
            .isEqualTo(str);
    }
    @Test
    @DisplayName("Односимвольная строка")
    void Test5() {
        String str = new String("a");
        String result = Task4.fixString(str);
        assertThat(result)
            .isEqualTo("a");
    }

}
