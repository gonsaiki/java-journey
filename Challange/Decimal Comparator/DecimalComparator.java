public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
        int oneValue = (int) one*1000;
        int twoValue = (int) two*1000;
        if (oneValue == twoValue){
            return true;
        }else {
            return false;
        }
    }
}
