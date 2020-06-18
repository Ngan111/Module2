import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int row = 0,col = 0;
        int max = matrix[0][0];
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if ( matrix[i][j] > max) {
                   max = matrix[i][j];
                   row = i+1; col = j+1;
                }
            }
        }
        System.out.println("The max is: "+" "+max+" "+"was found at"+" "+ row+","+col);
    }
}
