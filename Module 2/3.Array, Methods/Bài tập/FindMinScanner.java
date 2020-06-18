import java.util.Scanner;

public class FindMinScanner {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 10)
                System.out.println("Size shoudnt exceed 10");
        }while (size >10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element "+(i+1)+":");
            array[i] = input.nextInt();
            i++;
        }
        System.out.print("The array is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+ "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The max is"+" "+min+" "+"was found in "+index);

    }
}
