package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCustomTest {

    private LeapYearCustom lyc = new LeapYearCustom();

    @Test
    public void leapYearsThatAreNotCenturialYears() {
        lyc.setYear(2016);
        Assertions.assertTrue(lyc.isLeapYear());
    }

    @Test
    public void centurialLeapYears() {
        lyc.setYear(2000);
        Assertions.assertTrue(lyc.isLeapYear());
    }

    @Test
    public void nonLeapCenturialYears() {
        lyc.setYear(1500);
        Assertions.assertFalse(lyc.isLeapYear());
    }

    @Test
    public void nonLeapYears() {
        lyc.setYear(1999);
        Assertions.assertFalse(lyc.isLeapYear());
    }
}
