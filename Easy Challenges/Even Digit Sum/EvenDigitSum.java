public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0){
            return -1;
        }

        int eachDigit = 0;
        int sum = 0;

        do {
            eachDigit = number % 10;
            if (eachDigit%2==0){
                sum+=eachDigit;
            }
            number = number / 10;
        } while (number != 0);
        return sum;
    }
}
