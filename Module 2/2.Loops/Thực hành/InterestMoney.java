import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        int money;
        int month;
        float interest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of money");
        money = input.nextInt();
        System.out.println("Enter how many month");
        month = input.nextInt();
        System.out.println("Enter the interest");
        interest = input.nextFloat();
        double total_interest;
        for (int i = 0; i < month; i++) {
            total_interest = money*(interest/100)/12*month;
            System.out.println("The total interest you will be received:"+" "+total_interest);
        }

    }
}
