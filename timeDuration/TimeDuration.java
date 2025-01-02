package timeDuration;

public class TimeDuration {

    public static void main(String[] args) {

        System.out.println(getTimeDurationString(3945)); // 1st positive test
        System.out.println(getTimeDurationString(65, 45)); // 2nd positive test
        System.out.println(getTimeDurationString(-3945)); // 1st negative test
        System.out.println(getTimeDurationString(65, 145)); // 2nd negative test
        System.out.println(getTimeDurationString(-65, 45)); // 3rd negative test
    }

    public static String getTimeDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds + ")" +
                    ", must be a positive integer value";
        }
        return getTimeDurationString(seconds / 60, seconds % 60);
    }

    public static String getTimeDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + ")" +
                    ", must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds + ")" +
                    ", must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
