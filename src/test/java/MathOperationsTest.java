import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MathOperationsTest {
    static MathOperations mathOperations;

    @BeforeAll
    static void setup() {
         mathOperations = new MathOperations();
    }

    @Test
    void shouldSum() {
        int res = mathOperations.sum();

        assertThat(res)
                .isEqualTo(5);
    }

    @Test
    void shouldMultiply10 () {
        Random r = new Random();
        int randomNumber = r.nextInt();
        int res = mathOperations.multiply10(randomNumber);

        assertThat(res)
                .isEqualTo(randomNumber * 10);
    }
}
