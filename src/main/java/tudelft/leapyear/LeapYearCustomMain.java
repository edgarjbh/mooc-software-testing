package tudelft.leapyear;

public class LeapYearCustomMain {
    public static void main(String[] args) {
        LeapYearCustom lyc = new LeapYearCustom();
        lyc.setYear(2020);
        if (lyc.isLeapYear()) {
            System.out.println(lyc.getYear() + " is a Leap Year!");
        } else {
            System.out.println(lyc.getYear() + " is NOT a leap year");
        }
    }
}
