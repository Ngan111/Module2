package accessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    public final double PI = 3.14;

    Circle() {
    }
    Circle(double radius) {
    }
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }

    public double getArea() {
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The color of circle1 is:"+circle1.getColor());
        System.out.println("The radius of circle1 is: "+circle1.getRadius());
        System.out.println("The area of circle1 is: "+circle1.getArea());
    }
}
