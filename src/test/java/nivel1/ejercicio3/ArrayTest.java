package nivel1.ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayTest {
    ArrayClass arrayClass = new ArrayClass();

    @Test
    void sholdThrowException(){
        int i = arrayClass.theList.length + 1;
        int j = 1 - arrayClass.theList.length;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayClass.getWord(i));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayClass.getWord(j));
    }

    @Test
    void shouldNotThrowException (){
        assertDoesNotThrow(() -> ArrayClass.getWord(0));
        assertDoesNotThrow(() ->ArrayClass.getWord(1));
        assertDoesNotThrow(() ->ArrayClass.getWord(2));
    }
}
