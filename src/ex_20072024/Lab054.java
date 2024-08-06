package ex_20072024;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        //max number in two inputs//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1");
        int num1 = sc.nextInt();

        System.out.println("Enter no.2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Num1");
        } else if (num1 < num2) {
            System.out.println("Num2");
        } else {
            System.out.println("Equal numbers");
        }
    }
}