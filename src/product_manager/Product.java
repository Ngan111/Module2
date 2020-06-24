package product_manager;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    public int ID;
    public String name;
    public double price;

    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }
    //Khoi tao co tham so

    public Product() {
    } //Khoi tao khong tham so

    //Method getter va setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice())
            return 1;
        else if (o1.getPrice()>o2.getPrice())
            return -1;
        else
            return 0;
        }
    }
