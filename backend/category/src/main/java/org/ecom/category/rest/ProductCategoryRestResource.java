package org.ecom.category.rest;

import org.ecom.category.domain.ProductCategory;
import org.ecom.category.service.ProductCategoryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryRestResource {

  private ProductCategoryService productCategoryService;

  public ProductCategoryRestResource(ProductCategoryService productCategoryService) {
    this.productCategoryService = productCategoryService;
  }

  @GetMapping("/categories")
  public Iterable<ProductCategory> listProductCategories() {
    return productCategoryService.getProductCategories();
  }

  @PostMapping("/categories")
  public ProductCategory saveProductCategory(@RequestBody ProductCategory productCategory) {
    return productCategoryService.saveProductCategory(productCategory);
  }

  @GetMapping("/categories/{id}")
  public ProductCategory fetchProductCategoryById(@PathVariable Long id) {
    return productCategoryService.fetchProductCategoryById(id);
  }

  @PatchMapping("/categories")
  public void updateProductCategory(@RequestBody ProductCategory productCategory) {
    productCategoryService.updateProductCategory(productCategory);
  }

  @DeleteMapping("/categories/{id}")
  public void deleteProductCategory(@PathVariable Long id) {
    productCategoryService.deleteProductCategoryById(id);
  }
}
