package nivel1.ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DniCalculatorTest {
    private DniCalculator dniCalculator;

    @ParameterizedTest
    @ValueSource (strings = { "racecar", "radar", "able was I ere I saw elba" })
    void ShouldThrowExceptions (String input) {
        Assertions.assertThrows(Exception.class, () -> dniCalculator = new DniCalculator(input));
    }
}
