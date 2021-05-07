package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"Abc,3,invalid", "test 1,2,invalid", "abc Def,4,invalid"})
    public void testStringWithInvalidChars(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"abc,3,def", "aaa,2,ccc", "abc def,1,bcd efg"})
    public void testValidStringPositiveShift(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"xyz,3,abc", "zz,2,bb", "abc xyz,1,bcd yza"})
    public void testWordsWithZAndPositiveShift(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"xyz,-3,uvw", "zz,-4,vv", "def xyz,-1,cde wxy"})
    public void testValidStringAndNegativeShift(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"aaa,-3,xxx", "bca,-4,xyw", "aef xyz,-1,zde wxy"})
    public void testLowerBoundaryAndNegativeShift(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }

    @ParameterizedTest(name = "sentence={0}, shift={1}, expected={2}")
    @CsvSource({"aaa,0,aaa", "bca,0,bca", "aef xyz,26,aef xyz"})
    public void testZeroOrTopShift(String str, int shift, String expected) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals(expected, csc.CaesarShiftCipher(str, shift));
    }
}
