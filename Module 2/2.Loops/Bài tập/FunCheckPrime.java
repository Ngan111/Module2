package Excercises;

import java.util.Scanner;

public class FunCheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        CheckPrime(number);
    }

    public static void CheckPrime(int number) {
        if (number < 2) {
            System.out.println(number + " " + "isnt prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " " + "is prime");
            else
                System.out.println(number + " " + "isnt prime");
        }
    }
}