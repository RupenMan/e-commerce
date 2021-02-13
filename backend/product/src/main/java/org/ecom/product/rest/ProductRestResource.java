package org.ecom.product.rest;

import org.ecom.product.domain.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestResource {

    @GetMapping("/products")
    public List<Product> fetchProducts() {
        throw new UnsupportedOperationException();
    }

    @GetMapping(value = "/products/{id}")
    public Product fetchProductById(@PathVariable Long id) {
        throw new UnsupportedOperationException();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        throw new UnsupportedOperationException();
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        throw new UnsupportedOperationException();
    }
}
