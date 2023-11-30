import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void checkSum() {
        First first = new First();
        int res = first.sum();

        Assertions.assertEquals(5, res);
    }
}
