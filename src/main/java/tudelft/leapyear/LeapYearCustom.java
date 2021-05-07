package tudelft.leapyear;

import lombok.Data;

public @Data
class LeapYearCustom {

    private int year;

    public boolean isLeapYear() {
        if ((getYear() % 4) != 0) return false;
        else if ((getYear() % 100) != 0) return true;
        else if ((getYear() % 400) != 0) return false;
        else return true;
    }
}
