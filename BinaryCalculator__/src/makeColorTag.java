public class makeColorTag {
    public static void run(){
        System.out.println("Enter in decimals! (Integers)");
        System.out.println("Format: RED-GREEN-BLUE");
        String tag = readLine();
        String[] teile = tag.split("-");
        int redDec;
        int greenDec;
        int blueDec;
        redDec = Integer.parseInt(teile[0]);
        greenDec = Integer.parseInt(teile[1]);
        blueDec = Integer.parseInt(teile[2]);
        String formula = "";
        formula += Integer.toHexString(redDec);
        formula += Integer.toHexString(greenDec);
        formula += Integer.toHexString(blueDec);
        System.out.println("#"+formula);
    }

    public static String readLine() {
        return Main.scanner.nextLine();
    }
}
