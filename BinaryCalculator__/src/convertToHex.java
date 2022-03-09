public class convertToHex {
    public static void run() {
        System.out.print("Enter Integer: ");
        int integer = Integer.parseInt(readLine());
        System.out.println("Hex: "+((((Integer.toHexString(integer).toUpperCase())))));
    }
    public static String readLine() {
        return Main.scanner.nextLine();
    }
}
