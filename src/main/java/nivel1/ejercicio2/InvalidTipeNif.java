package nivel1.ejercicio2;

public class InvalidTipeNif extends RuntimeException {
    public InvalidTipeNif() {
        super("Debes intruducir un número, no se admiten otro tipo de datos");
    }
}
