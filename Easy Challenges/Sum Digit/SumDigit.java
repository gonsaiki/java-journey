public class SumDigit {

    public static void main(String[] args) {
        System.out.println(sumDigits(999));
    }

    public static int sumDigits(int number) {
        int sumAllDigit = 0;

        if (number < 10){
            return -1;
        }

        do {
            int extractLeast = number % 10;
            number = number / 10;
            sumAllDigit = sumAllDigit + extractLeast;
        } while (number != 0);

        return sumAllDigit;
    }
}
