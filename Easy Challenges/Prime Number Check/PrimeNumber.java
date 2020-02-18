public class PrimeNumber {
    
    public static boolean isPrime(int a) {
        if (a == 1) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
