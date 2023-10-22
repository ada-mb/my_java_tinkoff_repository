package edu.hw2.Task4Test;

import edu.hw2.Task4.CallingInfo;
import edu.hw2.Task4.Task4;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CallingInfoTest {
    @Test
    void positive() {
        CallingInfo callingInfo = Task4.callingInfo(new Throwable());
        assertThat(callingInfo.className()).isEqualTo("edu.hw2.Task4Test.CallingInfoTest");
        assertThat(callingInfo.methodName()).isEqualTo("positive");
    }
}
