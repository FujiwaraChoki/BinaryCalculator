import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends IllegalMonitorStateException{

    static Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws InterruptedException {
        try {
            new Main().runCode();
            scanner.close();
        } catch(IllegalMonitorStateException exception1) {
            System.out.println("Error, Program is closing!");
        } catch(InputMismatchException exception2) {
            System.out.println("Given input doesn't match required Datatype.");
        }
    }

    private void runCode() throws InterruptedException {
        System.out.println("BITTE IMMER IN 16 BITS ANGEBEN, DANKE!");
        String option;
        do {
            // Input erste Binaer Zahl
            System.out.print("Gebe Binaer 1 ein: ");
            String binaer1 = scanner.nextLine();

            // Input zweite Binaer Zahl
            System.out.print("Gebe Binaer 2 ein: ");
            String binaer2 = scanner.nextLine();

            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. OR Operator");
            System.out.println("5. XOR Operator");
            System.out.println("7. AND Operator");
            System.out.println("8. TO COLOR TAG");
            System.out.println("9. TO HEX");
            System.out.println("10. FROM HEX");
            System.out.println("11. Kompressfaktor berechnen");
            switch(Integer.parseInt(scanner.nextLine())) {
                case 1 -> additionBinaer(binaer1, binaer2);
                case 2 -> subtraktionBinaer(binaer1, binaer2);
                case 3 -> multiplikationBinaer(binaer1, binaer2);
                case 4 -> divisionBinaer(binaer1, binaer2);
                case 5 -> orOp.run(binaer1, binaer2);
                case 6 -> xorOP.run(binaer1, binaer2);
                case 7 -> andOP.run(binaer1, binaer2);
                case 8 -> makeColorTag.run();
                case 9 -> convertToHex.run();
                case 10 -> convertFromHex.run();
                default -> System.out.println("You're trying to use something that doesnt exist!");
            }
            System.out.println("Another Calculation?");
            System.out.println("y/n");
            option = scanner.nextLine().toUpperCase();
        } while(option.equals("Y"));
        System.out.println("Program is closing...");
        wait(2);
    }

    public static void additionBinaer(String s, String s2) {
        System.out.println("Binaer 1 -> " + s);
        System.out.println("Binaer 2 -> " + s2);
        System.out.println("Operator -> +");

        int dezimal = Integer.parseInt(s, 2);
        int dezimal2 = Integer.parseInt(s2, 2);
        int resultat = dezimal + dezimal2;

        String resultatInBinaer = toBinary(resultat);
        System.out.println("Summe: " + resultatInBinaer);
    }

    public static void subtraktionBinaer(String s, String s2) {
        System.out.println("Binaer 1 -> " + s);
        System.out.println("Binaer 2 -> " + s2);

        int dezimal = Integer.parseInt(s, 2);
        int dezimal2 = Integer.parseInt(s2, 2);
        int resultat = dezimal - dezimal2;

        String resultatInBinaer = toBinary(resultat);
        System.out.println("Differenz: " + resultatInBinaer);
    }

    public static void multiplikationBinaer(String s, String s2) {
        System.out.println("Binaer 1 -> " + s);
        System.out.println("Binaer 2 -> " + s2);

        int dezimal = Integer.parseInt(s, 2);
        int dezimal2 = Integer.parseInt(s2, 2);
        int resultat = dezimal * dezimal2;

        String resultatInBinaer = toBinary(resultat);
        System.out.println("Produkt: " + resultatInBinaer);
    }

    public static void divisionBinaer(String s, String s2) {
        int dividend = Integer.parseInt(s,2);
        int divisor = Integer.parseInt(s2,2);
        if(divisor!=0) {
            String quotient = Integer.toBinaryString((dividend/divisor));
            String remainder = Integer.toBinaryString((dividend%divisor));
            System.out.println("Quotient: "+quotient);
            System.out.println("Rest: "+remainder);
        }
        else {
            System.out.println("Divisor kann nicht 0 sein!");
        }
    }

    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void wait(int seconds) throws InterruptedException {
        int millis = seconds * 1000;
        Thread.sleep(millis);
    }
}
