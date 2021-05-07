package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateFactoryCustomTest {

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0"})
    public void testOnlyBigBars(int smallBars, int bigBars, int total, int expected) {
        ChocolateFactoryCustom cfc = new ChocolateFactoryCustom();
        Assertions.assertEquals(expected, cfc.calculateBarsInPackage(smallBars, bigBars, total));
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"6,0,5,5", "1,0,6,-1", "10,0,11,-1", "11,0,10,10"})
    public void testOnlySmallBars(int smallBars, int bigBars, int total, int expected) {
        ChocolateFactoryCustom cfc = new ChocolateFactoryCustom();
        Assertions.assertEquals(expected, cfc.calculateBarsInPackage(smallBars, bigBars, total));
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"1,1,5,0", "2,3,7,2", "1,1,20,-1","0,1,6,-1"})
    public void testTotalBiggerThanAmountOfBars(int smallBars, int bigBars, int total, int expected) {
        ChocolateFactoryCustom cfc = new ChocolateFactoryCustom();
        Assertions.assertEquals(expected, cfc.calculateBarsInPackage(smallBars, bigBars, total));
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"13,3,20,5", "10,10,50,0", "10,3,40,-1", "30,4,50,30"})
    public void testBigAndSmallBars(int smallBars, int bigBars, int total, int expected) {
        ChocolateFactoryCustom cfc = new ChocolateFactoryCustom();
        Assertions.assertEquals(-1, cfc.calculateBarsInPackage(1, 1, 20));
    }
}
