package Lambda_expressions;

import java.util.*;

// Product class definition
class Product {
    private String name;
    private double price;
    private double rating;
    private double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public double getDiscount() { return discount; }

    @Override
    public String toString() {
        return String.format("%s [Price: %.2f, Rating: %.1f, Discount: %.1f%%]",
                name, price, rating, discount);
    }
}


public class CustomSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000, 4.5, 10));
        products.add(new Product("Smartphone", 30000, 4.8, 15));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smartwatch", 10000, 4.0, 20));

        System.out.println("Original Product List");
        products.forEach(System.out::println);

        System.out.println("\nSorted by Price (Low → High) ");
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);


        System.out.println("\nSorted by Rating (High → Low) ");
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        products.forEach(System.out::println);


        System.out.println("\nSorted by Discount (High → Low)");
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        products.forEach(System.out::println);
    }
}