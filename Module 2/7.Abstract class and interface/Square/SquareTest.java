package Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[1];
        squares[0] = new Square();
        for (Square square:squares){
            if (square instanceof Square) {
                Colorable Square = (Square) square;
                System.out.println(Square.HowToColor());
            }
        }
    }
}
