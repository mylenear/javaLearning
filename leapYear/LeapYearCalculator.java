package leapYear;

/**
 * A leap year is a year that is divisible by 4 but NOT 100.
 * If it's divisible by 100, it has to be divisible by 400.
 * <p>
 * The following years are not leap years:
 * 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
 * This is because they are evenly divisible by 100 but not by 400.
 * <p>
 * The following years are leap years:
 * 1600, 2000, 2400
 * This is because they are evenly divisible by both 100 and 400.
 */
public class LeapYearCalculator {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600)); // return false since the parameter is not in range (1-9999)

        System.out.println(isLeapYear(1600)); // return true since 1600 is a leap year

        System.out.println(isLeapYear(2017)); // return false since 2017 is not a leap year

        System.out.println(isLeapYear(2024));  // return true because 2024 is a leap year
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            return false;
        }
    }
}
