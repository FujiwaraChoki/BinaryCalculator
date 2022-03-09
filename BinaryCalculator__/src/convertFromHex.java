public class convertFromHex {
    public static void run() {
        System.out.print("Enter Hex: ");
        String hex = readLine();
        int num = Integer.parseInt(hex, 16);

        System.out.println("Decimal: "+num);
    }

    public static String readLine() {
        return Main.scanner.nextLine();
    }
}
