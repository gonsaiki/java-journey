public class PrimeNumber {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 8; i < 100; i++) {
            boolean timAsu = isPrime(i);

            if (timAsu) {
                count++;
                System.out.println(i + " is prime number");
            }

            if (count == 3) {
                break;
            }
        }

        System.out.println("total prime number : " + count);
    }

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