package introductionJava.baitap;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter col");
        int col = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(arr[i][j]);
            }

        }
    }
}
