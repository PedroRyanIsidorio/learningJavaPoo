package primeiros_passos.programProduto.application;

import java.util.Scanner;
import java.util.Locale;

import primeiros_passos.programProduto.entities.Product;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        //System.out.println("Quantity: ");
        //int quantity = sc.nextInt();

        Product product = new Product(name, price);

        System.out.println(product.getName() + ", " + product.getPrice() + ", " + product.getQuantity());

        sc.close();
    }
}
