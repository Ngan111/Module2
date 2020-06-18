package accessModifier;

public class Car {
    private String name;
    private String engine;
    public static int numbersOfCars;
    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numbersOfCars++;
    }
    public String getName(){
        return name;
    }
    public String getEngine(){
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumbersOfCars() {
        return numbersOfCars;
    }

    public static void setNumbersOfCars(int numbersOfCars) {
        Car.numbersOfCars = numbersOfCars;
    }
    public static class Test{
        public static void main(String[] args) {
            Car car1 = new Car("Mazda3","SkyActiv3");
            System.out.println(Car.numbersOfCars);
            Car car2 = new Car("Mazda6","SkyActiv6");
            System.out.println(Car.numbersOfCars);

        }
    }
}
