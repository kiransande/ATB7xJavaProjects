package ex_20072024;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {
        // Program to find largest no. amoung three numbers

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();

        System.out.println("Enter num2");
        int num2= sc.nextInt();

        System.out.println("Enter num3");
        int num3= sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("Num1 is largest");
        } else if (num2>=num1 && num2>=num3)
        {
            System.out.println("Num2 is Largest");

        }
        else {
            System.out.println("Num3 is largest");
        }
    }
}
