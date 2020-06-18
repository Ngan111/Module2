package Circle;

import introductionJava.baitap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(4);
        circles[1] = new Circle(2);
        circles[2] = new Circle(9);
        System.out.println("Before arranging:");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        //Comparator la 1 interface co san cua Jv. So sanh hai doi so theo thu tu.
        Arrays.sort(circles,circleComparator);
        //Sap xep cac circles da dc khoi tao theo logic trong class circleComparator: Sap xep tu lon toi nho.
        System.out.println("After arranging:");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
