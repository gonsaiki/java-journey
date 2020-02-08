public class SecondAndMinutesChallange {

    public static void main(String[] args) {

        System.out.println(getDurationString(120, 59));
        System.out.println(getDurationString(7259));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        } else {
            if (minutes >= 60) {
                int myHour = minutes / 60;
                int myMinutes = minutes % 60;
                return +myHour + "h " + myMinutes + "m " + seconds + "s";
            }else {
                return "0h "+minutes+"m "+seconds+"s ";
            }
        }
    }

    public static String getDurationString (int seconds){
        if (seconds<0){
            return "Invalid Value";
        }else {
            if (seconds > 60){
                int anotherMinute = seconds/60;
                int remainingSeconds = seconds%60;
                return getDurationString(anotherMinute, remainingSeconds);
            }else {
                return "0h 0m " +seconds+ "s";
            }
        }
    }
}
