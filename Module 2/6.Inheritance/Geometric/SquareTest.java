package introductionJava.baitap;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(2);
        Square square3 = new Square(3,"yellow",true);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
    }
}
