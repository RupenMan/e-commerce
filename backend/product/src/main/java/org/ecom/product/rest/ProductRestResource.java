package org.ecom.product.rest;

import org.ecom.product.domain.Product;
import org.ecom.product.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestResource {

  private ProductService productService;

  public ProductRestResource(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products")
  public Iterable<Product> fetchProducts() {
    return productService.fetchProducts();
  }

  @GetMapping(value = "/products/{id}")
  public Product fetchProductById(@PathVariable Long id) {
    return productService.fetchProductById(id);
  }

  @PostMapping("/products")
  public Product saveProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
  }

  @DeleteMapping("/products/{id}")
  public void deleteProductById(@PathVariable Long id) {
    productService.deleteProductById(id);
  }

  @GetMapping(value = "/products", params = {"page", "size", "direction", "sort_by"})
  public Page<Product> fetchProductsById(@RequestParam int page, @RequestParam int size,
      @RequestParam String direction, @RequestParam("sort_by") String sortBy) {
    return productService.fetchProducts(page, size, direction, sortBy);
  }
}
