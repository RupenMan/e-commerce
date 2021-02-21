package org.ecom.category.service;

import java.util.NoSuchElementException;
import org.ecom.category.domain.ProductCategory;
import org.ecom.category.repository.ProductCategoryRepository;

public class ProductCategoryService {

  private ProductCategoryRepository productCategoryRepository;

  public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
    this.productCategoryRepository = productCategoryRepository;
  }

  public Iterable<ProductCategory> getProductCategories() {
    return productCategoryRepository.findAll();
  }

  public ProductCategory saveProductCategory(ProductCategory productCategory) {
    return productCategoryRepository.save(productCategory);
  }

  public ProductCategory fetchProductCategoryById(Long id) {
    return productCategoryRepository.findById(id).orElseThrow();
  }

  public void updateProductCategory(ProductCategory productCategory) {
    productCategoryRepository
        .findById(productCategory.getId())
        .ifPresentOrElse(
            p -> productCategoryRepository.save(productCategory),
            () -> {
              throw new NoSuchElementException();
            });
  }

  public void deleteProductCategoryById(Long id) {
    productCategoryRepository.deleteById(id);
  }
}
