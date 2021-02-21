package org.ecom.category.repository;

import org.ecom.category.domain.ProductCategory;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Long> {

}
