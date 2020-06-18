package introductionJava.baitap;

public class Shape {
    public String color;
    public boolean filled;
    //private: giới hạn chỉ cho trong file này dùng. Public: file nào dùng cũng đc. Protected giới hạn chỉ
    // trong package dùng.

    public Shape() {
        this.color = "green";
        this.filled = false;
        //Khởi tạo constructor không đối số.

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        //Khởi tạo constructor có đối số.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}




