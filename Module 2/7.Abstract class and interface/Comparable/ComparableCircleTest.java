package Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(4);
        circles[1] = new ComparableCircle(2);
        circles[2] = new ComparableCircle(8);
        System.out.println("Before comparing: ");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After comparing: ");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }
    }
}
