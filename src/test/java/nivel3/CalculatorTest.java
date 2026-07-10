package nivel3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void calculatorAddTest(){
        double amount = 100;
        calculator.add(amount);
        assertThat(calculator.getTotalAcumulate()).isEqualTo(amount);
        calculator.add(amount);
        assertThat(calculator.getTotalAcumulate()).isEqualTo(amount*2);
    }

    @Test
    void calculatorSubstractTest(){
        int initAmount = 500;
        int subsTract = 250;
        calculator.add(initAmount);
        calculator.subtract(subsTract);

        assertThat(calculator.getTotalAcumulate()).isEqualTo(initAmount-subsTract);
    }

    @Test
    void multipyTest (){
        calculator.add(100);
        calculator.multiply(50);

        assertThat(calculator.getTotalAcumulate()).isEqualTo(100*50);
    }

    @Test
    void divideTest(){
        calculator.add(100);
        calculator.divide(2);

        assertThat(calculator.getTotalAcumulate()).isEqualTo(100/2);
    }

    @Test
    void divideBy0ShouldThrowException(){
        calculator.add(100);

        assertThrows(ArithmeticException.class, ()-> calculator.divide(0));
    }

    @Test
    void resetTest(){
        calculator.add(30049);
        assertThat(calculator.getTotalAcumulate()).isNotZero();
        calculator.reset();
        assertThat(calculator.getTotalAcumulate()).isZero();
    }

}
