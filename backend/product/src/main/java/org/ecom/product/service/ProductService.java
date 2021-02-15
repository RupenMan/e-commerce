package org.ecom.product.service;

import org.ecom.product.domain.Product;
import org.ecom.product.exceptions.ResourceNotFoundException;
import org.ecom.product.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Product fetchProductById(Long id) {
    return productRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
  }

  public Iterable<Product> fetchProducts() {
    return productRepository.findAll();
  }

  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  public void deleteProductById(Long id) {
    productRepository.deleteById(id);
  }

  public Page<Product> fetchProducts(int page, int size, String direction, String sortParam) {
    return productRepository
        .findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.valueOf(direction), sortParam)));
  }
}
