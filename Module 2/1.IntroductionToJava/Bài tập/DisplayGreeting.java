import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello "+name);
    }
}
