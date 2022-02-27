public class andOP {
    public static void run(String binary1, String binary2) {
        String result = "";
        System.out.println("Binaer 1 -> " + binary1);
        System.out.println("Binaer 2 -> " + binary2);
        System.out.println("Operator -> XOR");
        char[] binary1Chars = binary1.toCharArray();
        char[] binary2Chars = binary2.toCharArray();
        for(int i=0; i<binary1Chars.length; i++) {
            if(binary1Chars[i] == '1' && binary2Chars[i] == '1') {
                result += ("1");
            } else if(binary1Chars[i] == '1' && binary2Chars[i] == '0'){
                result += ("0");
            } else if(binary1Chars[i] == '0' && binary2Chars[i] == '1') {
                result += ("0");
            } else {
                result += ("0");
            }
        }
        System.out.println("Ergebnis: "+result);
    }
}