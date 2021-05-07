package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({"xxggxx,true", "xxgxx,false", "xgxxx,false", "ggx,true", "gx,false"})
    public void testGhappyOneOccurrence(String word, boolean expected) {
        GHappy hap = new GHappy();
        Assertions.assertEquals(expected, hap.gHappy(word));
    }

    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({"xxggxxggww,true", "ggxxddgggcgchh,false", "ggxxxggxgg,true"})
    public void testGhappyMoreThanOneOccurrence(String word, boolean expected) {
        GHappy hap = new GHappy();
        Assertions.assertEquals(expected, hap.gHappy(word));
    }

}
