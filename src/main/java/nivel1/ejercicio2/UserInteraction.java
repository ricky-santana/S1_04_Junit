package nivel1.ejercicio2;

import java.util.Scanner;

public class UserInteraction {
    private static final String INTRO = "Hola, introduce el nombre un número positivo inferior a 99.999.999 " +
            "para calcular la letra del DNI\n";
    private static final String LETTER = "La letra es: ";
    private static final Scanner INPUT = new Scanner(System.in);

    public static void start (){
        System.out.println(INTRO);
        String userInput = INPUT.nextLine();
        try {
            DniCalculator dniCalculator = new DniCalculator(userInput);
            System.out.println(LETTER + dniCalculator.calculateDni());
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Empecemos de nuevo\n");
            UserInteraction.start();
        }

    }
}
