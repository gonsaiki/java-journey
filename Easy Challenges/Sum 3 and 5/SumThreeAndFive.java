public class SumThreeAndFive {
    public static void main(String[] args) {
//        type all code in main method

        int count = 0;
        int sumAll = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sumAll += i;
                System.out.println(i);
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("sum = " + sumAll);
    }
}
