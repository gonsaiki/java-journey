public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else {
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour + " km/h is equal to " +toMilesPerHour(kilometersPerHour)+ " m/h");
    }
}
