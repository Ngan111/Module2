package Animal;

import Edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2]; //khoi tao mang dong vat
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals) {
            //lap mang, lay dong vat trong mang
            animal.makeSound();
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible Chicken = (Chicken) animal;
                //ep kieu de chicken thuc hien phuong thuc HowToEat trong Edible
                System.out.println(Chicken.HowToEat());
            }
        }
    }
}
