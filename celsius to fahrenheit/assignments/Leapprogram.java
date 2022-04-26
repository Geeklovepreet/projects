package assignments;

import java.util.Scanner;

public class Leapprogram {
    public static void main(String[] args) {
        System.out.println("Welcome to leap year checker");
        System.out.println("Please enter a year in YYYY");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();
        if(year%4 == 0){
            System.out.println("The year entered by you is a Leap year ");
            System.out.println("thanks for using this programe :)");
        }
        else{
            System.out.println("The year entered by you is not a leap year");
            System.out.println("thanks for using this programe :)");

        }
    }
}
