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
        String redDecHex = Integer.toHexString(redDec);
        // Check
        if(redDecHex.length() == 1) {
            redDecHex = "0" + (redDecHex);
        }
        String greenDecHex = Integer.toHexString(greenDec);
        // Check
        if(greenDecHex.length() == 1) {
            greenDecHex = "0" + (greenDecHex);
        }
        String blueDecHex = Integer.toHexString(blueDec);
        // Check
        if(blueDecHex.length() == 1 ) {
            blueDecHex = "0" + (blueDecHex);
        }
        String formula = "";
        formula += redDecHex;
        formula += greenDecHex;
        formula += blueDecHex;
        System.out.println("#"+formula);
    }

    public static String readLine() {
        return Main.scanner.nextLine();
    }
}
