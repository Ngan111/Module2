package introductionJava.thuchanh;

import java.util.Scanner;

public class FindElementsInArray {
    public static void main(String[] args) {
        String[] student = {"Rose", "John", "Tom", "Cherry", "Michael", "Mary", "Julie", "Kim", "Henry", "Alvin", "Sarah", "Kitty"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println(input_name +" "+"was found in" +" "+(i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(input_name + "wasnt found in this list");
        }
    }
}

