package nivel1.ejercicio2;

public class InvalidRangeNumber extends RuntimeException {
    public InvalidRangeNumber() {
        super("El número no puede ser negativo ni superior a 99.999.999");
    }
}
