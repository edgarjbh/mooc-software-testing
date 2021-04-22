package tudelft.roman;

public class RomanNumeralCustomMain {
    public static void main(String[] args) {
        RomanNumeralCustom rnc = new RomanNumeralCustom();

        String arg1 = "XVI";
        int result = rnc.convert(arg1);

        System.out.println("Converting " + arg1 + " > " + result);
    }
}
