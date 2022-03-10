public class kompressFaktorBerechnen {
    public static void run() {
        System.out.print("Speicherbedarf der komprimierten Daten: ");
        int speBeKoDa = readInt();
        System.out.print("Speicherbedarf der urspruenglichen Daten: ");
        int speBeUrDa = readInt();
        int zwischenErgebnis = (speBeKoDa * 100) / speBeUrDa;
        var kompressfaktor = 100-zwischenErgebnis;
        System.out.print("Kompressfaktor: "+(kompressfaktor));
    }

    public static String readLine() {
        return Main.scanner.nextLine();
    }

    public static int readInt() {
        return Integer.parseInt(readLine());
    }
}
