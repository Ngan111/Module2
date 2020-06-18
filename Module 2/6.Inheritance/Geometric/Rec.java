package introductionJava.baitap;

public class Rec extends Shape {
    public double Height;
    public double Width;

    public Rec() {
        this.Height = 1;
        this.Width = 3;

    }
    public Rec(double Height, double Width) {
        this.Height = Height;
        this.Width = Width;
    }
    public Rec (double Width, double Height,String color, boolean filled) {
        super(color, filled);
        this.Width = Width;
        this.Height = Height;
    }
    public double getHeight() {
        return Height;
    }
    public double getWidth() {
        return Width;
    }
    public void setHeight(double height) {
        Height = height;
    }
    public void setWidth(double width) {
        Width = width;
    }
    @Override
    public String toString () {
        return "A rectangle with the width="
                +getWidth()
                +"the height="
                +getHeight()
                +",which a subclass of "
                +super.toString();
    }
}
