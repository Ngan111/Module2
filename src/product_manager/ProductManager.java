package product_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager extends ArrayList<Product> {
    //private ArrayList<Product> listProduct;

    public ProductManager() {
    }

    public void editProduct(int ID, String name, double price) {
        searchById(ID).setName(name);
        searchById(ID).setPrice(price);
    }

    public Product searchById(int id) {
        for (int i = 0; i < this.size(); i++) {
            if (id == this.get(i).getID()) {
                return this.get(i);
            }
        }
        return null;
    }

    public void searchByName(String name) {
        for (int i = 0; i < this.size(); i++) {
            if (name.equals(this.get(i).getName())) {
                System.out.println(this.get(i).toString());
            }
        }
        System.out.println("This product wasnt founded in this list");
    }

    public void display() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i).toString());
        }
    }
}
