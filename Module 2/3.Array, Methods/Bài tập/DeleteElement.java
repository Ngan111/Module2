package introductionJava.thuchanh;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[]number = {24,6,94,11,1,92,18,19,20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to delete: ");
        int value = scanner.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == value) {
                for (int j = i; j < number.length-1; j++) {
                    number[j] = number[j+1];
                }
            }
        }
        number[number.length-1] = 0;
        System.out.println("The array after deleting is:");
        for (int k = 0; k < number.length; k++) {
            System.out.print(number[k]+"\t");
        }
    }

}
