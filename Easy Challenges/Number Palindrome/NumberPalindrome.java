public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int temporary = number;
        int lastDigit;

        do {
            lastDigit = temporary % 10;
            temporary = temporary / 10;
            reverse *= 10;
            reverse += lastDigit;
        } while (temporary != 0);

        return number == reverse;

    }
}
