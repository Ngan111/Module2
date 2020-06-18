package Excercises;

public class CheckPrime {
        public static void main(String[] args) {
            int i;
        int n = 2;
        int count = 0;
        boolean check;
        while (count < 20) {
            check = true;
            for(i = 2;i<n;i++) {
                if (n%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(n+" "+"is prime");
            }
            n++;
            }
        }
}
