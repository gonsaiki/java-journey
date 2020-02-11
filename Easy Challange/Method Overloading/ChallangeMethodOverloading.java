package com.aditya;

public class ChallangeMethodOverloading {

//    public static void main(String[] args) {
//        int newScore = calculateScore("Aditya", 500);
//        System.out.println("Your score is " + newScore);
//    }
//
//    public static int calculateScore (String name, int score){
//        System.out.println("Player " +name+ " scored " +score+ " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore (int score){
//        System.out.println("Unamed player scored " +score+ " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore (){
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(1.0, 13.0));
        System.out.println(calcFeetAndInchesToCentimeters(2.0));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >=0){
            if (inches >=0 && inches <= 12){
                feet *= 12 + inches;
                return feet*2.54;
            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >=0){
            double feet = inches/12;
            int remaining = (int) feet;
            return calcFeetAndInchesToCentimeters(feet,remaining);
        }else {
            return -1;
        }
    }
}
