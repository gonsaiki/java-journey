public class AnotherSoulution {

    public static final String INVALID_VALUE_MESSAGE = "Error woy";

    public static void main(String[] args) {

        System.out.println(getDurationString(3000, 59));
        System.out.println(getDurationString(7259));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int myHour = minutes / 60;
        int myMinutes = minutes % 60;

        String hourString = "" +myHour;
        String minutesString = "" + myMinutes;

        if (myHour < 10){
            hourString = "0" +myHour;
        }
        if (myMinutes < 10){
            minutesString = "0" + myMinutes;
        }

        return hourString + "h " + minutesString + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int anotherMinute = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(anotherMinute, remainingSeconds);
    }
}

