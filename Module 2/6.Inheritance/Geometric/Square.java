package introductionJava.baitap;

public class Square extends Rec {
    private double Side;
    public Square(){
        this.Side = 1;
        this.Height = 1;
        this.Width = 1;
    }
    public Square(double Side){
        this.Side = Side;
        this.Width = 1;
        this.Height = 1;
    }
    public Square (double Side,String color,boolean filled) {
        super(1,1,color,filled);
        this.Side = Side;

    }
    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }
    @Override
    public String toString() {
        return "A square with the side="
                +getSide()
                +",which a subclass of "
                +super.toString();
    }
}
