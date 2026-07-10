package nivel1.ejercicio2;

public class DniCalculator {
    private final int Nif;

    public DniCalculator(String nif) {
        this.Nif = validateNif(nif);
    }

    private char calculateLetter (){
        final String letterList = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letterList.charAt(this.Nif%23);
    }

    public String calculateDni (){
        return this.Nif + "-" +this.calculateLetter();
    }

    private int validateNif(String input ) {
        int nif;
        try {
           nif = Integer.parseInt(input);
        }catch (Exception e) {
            throw new InvalidTipeNif();
        }
        if (nif > 99999999 || nif < 0) {
            throw new InvalidRangeNumber();
        }
        return nif;
    }

}
