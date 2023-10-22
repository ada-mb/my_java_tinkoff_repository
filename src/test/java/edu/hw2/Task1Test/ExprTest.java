package edu.hw2.Task1Test;

import edu.hw2.Task1.Addition;
import edu.hw2.Task1.Constant;
import edu.hw2.Task1.Exponent;
import edu.hw2.Task1.Multiplication;
import edu.hw2.Task1.Negate;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class ExprTest {
    @Test
    void positive() {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, 2);
        var res = new Addition(exp, new Constant(1));
        assertThat(res.evaluate())
            .isEqualTo(37);

        assertThat(new Exponent(new Constant(0), 1).evaluate())
            .isEqualTo(new Exponent(new Constant(0), 2).evaluate());
    }
    @Test
    void negative() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(()->{
                var exp = new Exponent(new Constant(0), -2);
            });
    }

}
