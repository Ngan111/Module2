package introductionJava.thuchanh;

import java.util.Scanner;

public class InsertElement {
    public static int[] insertElement(int newValue, int index, int[] arr) {
        int[] newArr = new int[arr.length + 1];

        int i;
        for(i = 0; i < index; ++i) {
            newArr[i] = arr[i];
        }

        for(i = arr.length; i > index; --i) {
            newArr[i] = arr[i - 1];
        }

        newArr[index] = newValue;

        for(i = 0; i < newArr.length; ++i) {
            System.out.print(newArr[i] + "\t");
        }

        return newArr;
    }
    public static void main(String[] args) {
        int index = 0;
        int[]number = {24,6,94,11,20,1,92,18,19,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to insert: ");
        int value = scanner.nextInt();
        System.out.println("Enter the location you want to insert: ");
        int location = scanner.nextInt();
        insertElement(value, location, number);
    }
}
