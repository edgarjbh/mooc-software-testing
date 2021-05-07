package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralCustomTest {

    private RomanNumeralCustom rnc;

    @BeforeEach
    public void initialize() {
        this.rnc = new RomanNumeralCustom();
        // System.out.println("Initializing...");
    }

    @Test
    void singleNumberTest() {
        int result = rnc.convert("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    void numberWithManyDigitsTest() {
        int result = rnc.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotationTest() {
        int result = rnc.convert("XXIV");
        Assertions.assertEquals(24, result);
    }

    @Test
    void numberWithAndWithoutSubtractiveNotationTest() {
        int result = rnc.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

}
