package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Передача неккоректных секунд 00:599, ожидание -1")
    void Test1() {
        // given
        String str = new String("00:599");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(-1);
    }
    @Test
    @DisplayName("Передача корректного 13:56, ожидание 836")
    void Test2() {
        // given
        String str = new String("13:56");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(836);
    }
    @Test
    @DisplayName("Передача некорректного формата 13:6573:22840, ожидание -1")
    void Test3() {
        // given
        String str = new String("13:6573:22840");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(-1);
    }
    @Test
    @DisplayName("Передача некорректного формата abcd:ddd, ожидание -1")
    void Test4() {
        // given
        String str = new String("abcd:ddd");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(-1);
    }
    @Test
    @DisplayName("Странные входные данные")
    void Test5() {
        // given
        String str = new String("1:1");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(61);
    }
    @Test
    @DisplayName("NullPointer")
    void Test6() {
        // given
        String str = null;

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(-1);
    }
    @Test
    @DisplayName("Непонятные входные данные 33 -> -1")
    void Test7() {
        // given
        String str = new String("33");

        // when
        long minutes = Task1.minutesToSeconds(str);

        // then
        assertThat(minutes)
            .isEqualTo(-1);
    }
}
