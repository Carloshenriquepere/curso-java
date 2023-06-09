package src.java;

import src.java.entities007.Product;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product + "\n");

        System.out.print("Enter the number of product to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product + "\n");

        System.out.print("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product + "\n");


        sc.close();

    }
}
