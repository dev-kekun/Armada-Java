package Java_Playground;

public class Product {
    
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;

        System.out.println(name + " Successfully Created with a price of " + price);
    }
}
