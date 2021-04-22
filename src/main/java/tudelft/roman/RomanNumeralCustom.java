package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralCustom {
    private final static Map<Character, Integer> romanValues;
    static {
        romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    public int convert(String romanNumber) {
        int sum = 0;
        char previous = '0';
        for (char letter : romanNumber.toCharArray()) {
            if (previous != '0' && (romanValues.get(previous) < romanValues.get(letter))) {
                sum -= romanValues.get(previous) * 2;
            }
            sum += romanValues.get(letter);
            previous = letter;
        }
        return sum;
    }
}
