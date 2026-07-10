package nivel3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    void calculatorStratsWithZero(){
        assertThat(calculator.getTotalAcumulate()).isZero();
    }
    @Test
    void calculatorAddsCorrectly(){
        double amount = 100;
        calculator.add(amount);
        assertThat(calculator.getTotalAcumulate()).isEqualTo(amount);
        calculator.add(amount);
        assertThat(calculator.getTotalAcumulate()).isEqualTo(amount*2);
    }
}
