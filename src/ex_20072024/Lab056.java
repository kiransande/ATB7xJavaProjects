package ex_20072024;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {
        //switch-used for more than 2+condition
        // find which day it is

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. between 1 to 7");
        int day= sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
            break;

            case 2:
                System.out.println("Tuesday");
            break;

            case 3:
                System.out.println("Wednesday");
            break;

            case 4:
                System.out.println("Thursday");
            break;

            case 5:
                System.out.println("Friday");
            break;

            case 6:
                System.out.println("Saturday");
            break;

            case 7:
                System.out.println("Sunday");
            break;

            default:
                System.out.println("No idea what day it is");
            break;
        }
    }
}
