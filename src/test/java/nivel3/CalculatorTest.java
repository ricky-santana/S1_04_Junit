package nivel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator;

    @Test
    void calculatorStratsWithZero(){
        calculator = new Calculator();
        assertThat(calculator.getTotalAcumulate()).isZero();
    }
}
