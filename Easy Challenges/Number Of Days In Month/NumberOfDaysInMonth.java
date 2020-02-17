public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        int myValue = getDaysInMonth(2, 2024);
        System.out.println(myValue);

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }


    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999) {
            return -1;
        } else if (month < 1 || month > 12) {
            return -1;
        }

        int days;
        boolean checkFirst = isLeapYear(year);

        if (checkFirst) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    days = 29;
                    break;
                default:
                    days = 30;
                    break;
            }
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                default:
                    days = 30;
                    break;
            }
        }
        return days;
    }
}
