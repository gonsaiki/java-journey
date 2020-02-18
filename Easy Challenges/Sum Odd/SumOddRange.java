public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (end < start || start < 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            boolean check = isOdd(i);
            if (check) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
