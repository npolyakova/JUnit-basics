import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MathOperationsTest {
    static MathOperations mathOperations;
    static Random r;

    @BeforeAll
    static void setup() {
        mathOperations = new MathOperations();
        r = new Random();
    }

    @Test
    void shouldSum() {
        int res = mathOperations.sum();

        assertThat(res)
                .isEqualTo(5);
    }

    @Test
    void shouldMultiply10() {
        int randomNumber = r.nextInt();
        int res = mathOperations.multiply10(randomNumber);

        assertThat(res)
                .isEqualTo(randomNumber * 10);
    }

    @Test
    void shouldDivide100() {
        assertThat(mathOperations.divide100(3))
                .isEqualTo(33);
    }

    @Test
    void shouldSumString() {
        int res = r.nextInt();
        String str = mathOperations.sumStrings(res);

        assertThat(str).isEqualTo("Результат вычисления = " + res);
    }
}
