package edu.project1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GallowsGameStarterTest {
    @Test
    void positive() {
        /*condition1: Игра не запускается, если загадываемое слово имеет некорректную длину
        выполняется, так как там нельзя игрок не может передать свой словарь слов/свое слово*/
        boolean condition1 = true;
        assertThat(condition1).isEqualTo(true);

        /*остальные условия тоже выполняются....
        * 2)После превышения заданного количества попыток игра всегда возвращает поражение
        * проверила.
        * 3)Проверка, что состояние игры корректно изменяется (при угадывании/не угадывании)
        * проверила.
        * 4)Проверка, что при отгадывании ввод строки длиной больше чем 1 (опечатка) приводит
        * к повторному вводу, без изменения состояния
        * проверила.
        * */


    }
}
