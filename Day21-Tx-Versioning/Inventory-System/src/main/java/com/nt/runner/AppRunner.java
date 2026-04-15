package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.service.ProductService;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private ProductService service;

    @Override
    public void run(String... args) {

        System.out.println("Adding Products");

        Product p1 = service.addProduct(new Product(null, "Laptop", 50000.00, 10, 0, null, null));
        Product p2 = service.addProduct(new Product(null, "Mobile", 20000.00, 5, 0, null, null));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n---- Product List ----");
        service.viewAllProducts().forEach(System.out::println);

        System.out.println("\nUpdating Price...");
        Product updated = service.updateProductPrice(1L, 55000);
        System.out.println(updated);

        System.out.println("\nPurchasing Product...");
        service.purchaseProduct(1L, 2);

        System.out.println("\nAfter Purchase:");
        service.viewAllProducts().forEach(System.out::println);

        System.out.println("\nBulk Price Update (+10%)");
        service.bulkUpdatePrice();

        service.viewAllProducts().forEach(System.out::println);

        System.out.println("\nDeleting Product ID 2");
        service.deleteProduct(2L);

        service.viewAllProducts().forEach(System.out::println);
    }
}