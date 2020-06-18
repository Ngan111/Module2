import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of USD you want to exchange: ");
        USD = input.nextDouble();
        double unit = USD*VND;
        System.out.println("The amount of VND you will be received is: "+unit);
    }
}
