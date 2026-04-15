package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Product;
import com.nt.exception.InsufficientStockException;
import com.nt.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // 1. Add Product
    public Product addProduct(Product product) {
        return repository.save(product);
    }

    // 2. View All
    public List<Product> viewAllProducts() {
        return repository.findAll();
    }

    // 3. Update Price
    public Product updateProductPrice(Long id, double newPrice) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setPrice(newPrice);

        return repository.save(product);
    }

    // 4. Purchase Product
    public Product purchaseProduct(Long id, int qty) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (qty > product.getQuantity()) {
            throw new InsufficientStockException("Not enough stock available!");
        }

        product.setQuantity(product.getQuantity() - qty);

        return repository.save(product);
    }

    // 5. Bulk Update Price
    public void bulkUpdatePrice() {
        List<Product> products = repository.findAll();

        for (Product p : products) {
            p.setPrice(p.getPrice() * 1.10); // +10%
        }

        repository.saveAll(products);
    }

    // 6. Delete Product
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}