package Excercises;
import java.util.Scanner;
public class Common {
        public static void main(String[] args) {
            int a, b;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a: ");
            a = input.nextInt();
            System.out.println("Enter b: ");
            b = input.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);
            System.out.println(common(a,b)>0?"Greatest common divisor is: "+common(a,b):"Nothing");

        }
        private static int common(int a, int b){
            int max = Math.max(a,b);
            for (int i = max; i > 0; i--) {
                if(a%i==0 && b%i==0)
                    return i;
            }
            return -1;
        }
    }

