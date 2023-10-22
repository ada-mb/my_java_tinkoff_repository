package edu.hw2.Task2Test;

import edu.hw2.Task2.Rectangle;
import edu.hw2.Task2.Square;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class SquareTest {
    @Test
    void positive() {
        assertThat(new Square(2).area())
            .isEqualTo(4);

        Rectangle rect1 = new Square(10);
        assertThat(rect1.area())
            .isEqualTo(100);

        Rectangle rect2 = new Rectangle(15,12);
        rect1 = rect2;
        assertThat(rect1.area())
            .isEqualTo(rect2.area());
    }
    @Test
    void negative() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(()->{
                Square square = new Square(-10);
            });
    }
}
