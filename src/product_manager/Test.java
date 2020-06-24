package product_manager;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //add product's info
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(0, "A", 12);
        Product product2 = new Product(1, "B", 9);
        Product product3 = new Product(2, "C", 16);
        Product product4 = new Product(3, "E", 8);
        Product product5 = new Product(4, "T", 26);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product5);

        System.out.println("Enter a number" + "\n"
                + "1.Add product" + "\n"
                + "2.Edit products" + "\n"
                + "3.Delete products" + "\n"
                + "4.Display products" + "\n"
                + "5.Search products" + "\n"
                + "6.Sort products");
        int choice = 1;

        while (choice != 0) {
            System.out.println("Choose a number");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1://Add products' info by scanner
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Add new product");
                    System.out.print("Enter the ID:");
                    int ID = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the name:");
                    String productName = scanner.nextLine();
                    System.out.print("Enter the price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Product newProduct = new Product(ID,productName,price);
                    productManager.add(newProduct);
                    productManager.display();
                    break;
                case 2: //Edit info.
                    System.out.println("Enter the product's ID you want to edit");
                    Scanner scanner2 = new Scanner(System.in);
                    int num = scanner2.nextInt();
                    System.out.println("Edit name");
                    Scanner scanner3 = new Scanner(System.in);
                    String name = scanner3.nextLine();
                    System.out.println("Edit price");
                    Scanner scanner4 = new Scanner(System.in);
                    double money = scanner4.nextDouble();
                    productManager.editProduct(num, name, money);
                    productManager.display();
                    break;
                case 3: //Delete products.
                    Scanner number3 = new Scanner(System.in);
                    System.out.println("Enter product's index you want to delete");
                    int name3 = number3.nextInt();
                    System.out.println("The products were deleted: " + productManager.remove(name3));
                    break;
                case 4: //Display products.
                    productManager.display();
                    break;
                case 5: //Find products.
                    System.out.println("Enter the product's name you want to search");
                    Scanner scanner6 = new Scanner(System.in);
                    String name1 = scanner6.nextLine();
                    productManager.searchByName(name1);
                    break;
                case 6: //Arranging from large to small
                    System.out.println("Sort");
                    Collections.sort(productManager, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            if (o1.getPrice() < o2.getPrice())
                                return 1;
                            else if (o1.getPrice()>o2.getPrice())
                                return -1;
                            else
                                return 0;
                        }
                    });
                    Collections.sort(productManager, new Product());
                    {
                        for (Product product:productManager) {
                            System.out.println(product);
                        }
                }
                    break;
            }
        }
    }
}
