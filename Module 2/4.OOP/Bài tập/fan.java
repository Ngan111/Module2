package introductionJava.baitap;

public class fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public int getSpeed() {
        return speed;
    }
    public boolean getOn () {
        return on;
    }
    public double getRadius () {
        return radius;
    }
    public String getColor () {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public fan() {
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }
    public fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (this.on == true) {
            return "speed:"+this.speed+",color:"+this.color+",radius:"+this.radius+" Fan is on";
        } else {
           return "color:"+this.color+",radius:"+this.radius+" Fan is off";
        }
    }

    public static void main(String[] args) {
        fan fan2 = new fan(fan.SLOW,false, 5,"blue");
        fan fan1 = new fan(fan.MEDIUM,true,10,"yellow");
        fan fan3 = new fan();
        System.out.println("fan2"+" "+fan2.toString());
        System.out.println("fan1"+" "+fan1.toString());
        System.out.println("fan3"+" "+fan3.toString());
    }
}



