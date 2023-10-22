package edu.hw2.Task2Test;

import edu.hw2.Task2.Rectangle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class RectangleTest {
    @Test
    void positive() {
        assertThat(new Rectangle(2,5).area())
            .isEqualTo(10);
    }
    @Test
    void negative() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(()->{
                Rectangle rect = new Rectangle(-10,5);
            });
    }
}
