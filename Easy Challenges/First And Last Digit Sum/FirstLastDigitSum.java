public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int tmp = number;
        int firstDigit = 0;

        do {
            firstDigit = tmp % 10;
            tmp = tmp / 10;
        } while (tmp != 0);

        return lastDigit + firstDigit;
    }
}
