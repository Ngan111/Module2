package introductionJava.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double result;
    double root1;
    double root2;
    private double a, b, c;
    public double d;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return result = (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return root1 = (-this.b + (Math.sqrt(result))) / (2 * this.a);
    }

    public double getRoot2() {
        return root2 = (-this.b - (Math.sqrt(result))) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the A number");
        double a = scanner.nextDouble();
        System.out.println("Enter the B number");
        double b = scanner.nextDouble();
        System.out.println("Enter the C number");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("The Discriminant is: \n" + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The root1 is: " + quadraticEquation.getRoot1());
            System.out.println("The root2 is: " + quadraticEquation.getRoot2());
        }
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The root is: " + quadraticEquation.getRoot1());
        }
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("There isnt any roots in this case");
            System.out.println(quadraticEquation.d);
            System.out.println(quadraticEquation.getA());
            /* Vì a,b,c đc khai báo private nên muốn lấy giá trị ra ta phải dùng getA. Biến d đc khai báo public nên ta
            có thể lấy ra mà ko cần get*/
        }
    }
}
