package introductionJava.thuchanh;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in the fist array");

        int i;
        for(i = 0; i < arr1.length; ++i) {
            System.out.println("Element" + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements in the second array");

        for(i = 0; i < arr2.length; ++i) {
            System.out.println("Element" + (i + 1) + " :");
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[8];

        for(i = 0; i < arr1.length; ++i) {
            arr3[i] = arr1[i];
        }

        i = arr1.length;

        for(int j = 0; j < arr2.length; ++j) {
            arr3[i] = arr2[j];
            ++i;
        }

        System.out.println("New array: ");

        for(i = 0; i < arr3.length; ++i) {
            System.out.print(arr3[i] + "\t");
        }

    }
}

