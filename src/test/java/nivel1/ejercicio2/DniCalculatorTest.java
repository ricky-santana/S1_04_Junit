package nivel1.ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class DniCalculatorTest {
    private DniCalculator dniCalculator;

    @ParameterizedTest
    @ValueSource (strings = { "racecar", "-1", "100000000"})
    void shouldThrowExceptions (String input) {
        assertThrows(Exception.class, () -> dniCalculator = new DniCalculator(input));
    }

    @ParameterizedTest
    @CsvSource({"12345678, Z", "87654321, X", "11111111, H", "99999999, R", "55555555, K",
            "45678912, S", "74185297, Q", "36925815, M", "10203040, X", "77777777, B"})
    void shouldWork (String input, Character letter) {
        String expectedDni = input + "-" + letter;
        DniCalculator dniCalculator = new DniCalculator(input);
        assertEquals(expectedDni, dniCalculator.calculateDni());
    }

    @ParameterizedTest
    @CsvSource({"12345678, z", "87654321, x", "11111111, h", "99999999, r", "55555555, k",
            "45678912, A", "74185297, A", "36925815, A", "10203040, A", "77777777, A"})
    void shouldNotWork (String input, Character letter) {
        String expectedDni = input + "-" + letter;
        DniCalculator dniCalculator = new DniCalculator(input);
        assertNotEquals(expectedDni, dniCalculator.calculateDni());
    }


    }
