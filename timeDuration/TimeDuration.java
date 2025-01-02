package timeDuration;

public class TimeDuration {

    public static void main(String[] args) {
        System.out.println(getTimeDurationString(3945)); // 1st positive test
        System.out.println(getTimeDurationString(65, 45)); // 2st positive test
    }

    public static String getTimeDurationString(int seconds) {
        return getTimeDurationString(seconds / 60, seconds % 60);
    }

    public static String getTimeDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
