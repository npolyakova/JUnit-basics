import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MathOperationsTest {

    @Test
    void shouldSum() {
        MathOperations mathOperations = new MathOperations();
        int res = mathOperations.sum();

        assertThat(res)
                .isEqualTo(5);
    }

    @Test
    void shouldMultiply10 () {
        MathOperations mathOperations = new MathOperations();
        Random r = new Random();
        int randomNumber = r.nextInt();
        int res = mathOperations.multiply10(randomNumber);

        assertThat(res)
                .isEqualTo(randomNumber * 10);
    }
}
