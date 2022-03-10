public class kompressFaktorBerechnen {
    public static void run() {
        System.out.print("Speicherbedarf der komprimierten Daten: ");
        int speBeKoDa = readInt();
        System.out.println("Speicherbedarf der komprimierten Daten -> "+speBeKoDa+" Kilobyte");
        System.out.print("Speicherbedarf der urspruenglichen Daten: ");
        int speBeUrDa = readInt();
        System.out.println("Speicherbedarf der urspruenglichen Daten -> "+speBeUrDa+" Kilobyte");
        float zwischenErgebnis = (speBeKoDa * 100) / speBeUrDa;
        float kompressfaktor = 100-zwischenErgebnis;
        System.out.println("Kompressfaktor: "+(kompressfaktor));
    }

    public static String readLine() {
        return Main.scanner.nextLine();
    }

    public static int readInt() {
        return Integer.parseInt(readLine());
    }
}
