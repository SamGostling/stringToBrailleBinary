
public class StringToBrailleBinary {

    public static void main(String[] args) throws Exception {
        System.out.println(stringToBrailleBinary("Hello World"));
    }

    public static String stringToBrailleBinary(String s) {
        //Array storing conversion for every letter
        String[] base = {"100000", "110000", "100100", "100110", "100010", "110100", "110110", "110010", "010100", "010110",
                "101000", "111000", "101100", "101110", "101010", "111100", "111110", "111010", "011100", "011110", "101001",
                "111001", "010111", "101101", "101111", "101011"};
        StringBuilder braille = new StringBuilder();

        for (int i = 0, n = s.length(); i < n; i++){
            char c = s.charAt(i);

            //binary braille for capital letters
            if (Character.isUpperCase(c)) {
                braille.append("000001");
            }

            //binary braille for a space
            int val = Character.toLowerCase(c);
            if (val == 32){
                braille.append("000000");
            }
            else {
                val = val - 97;

                braille.append(base[val]);
            }
        }
        return braille.toString();
    }

}
