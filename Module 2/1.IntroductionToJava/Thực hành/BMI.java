import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height, BMI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight(kg)");
        weight = input.nextDouble();
        System.out.println("Enter your height(m)");
        height = input.nextDouble();
        BMI = weight/Math.pow(height,2);
        if (BMI < 18.5) {
            System.out.println("Your BMI is:"+BMI +","+"Underweight");
        } else if (BMI < 25) {
            System.out.println("Your BMI is:"+BMI +","+"Normal");
        } else if (BMI < 30) {
            System.out.println("Your BMI is:"+BMI +","+"Overweight");
        } else  {
            System.out.println("Your BMI is:"+BMI +","+"Obese");
        }

    }
}
