package introductionJava.baitap;

import java.util.Scanner;

public class PractiseTest {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = choice.nextInt();
        switch (num) {
            case 1:
                PractiseArrayLinkedList<Integer>listInteger = new PractiseArrayLinkedList<Integer>();
                System.out.println("Enter a number you want to add");
                Scanner input = new Scanner(System.in);
                int number = input.nextInt();
                listInteger.add(number);
                listInteger.display(number);
                break;
            case 2:
                System.out.println("Delete");
        }


    }
}
