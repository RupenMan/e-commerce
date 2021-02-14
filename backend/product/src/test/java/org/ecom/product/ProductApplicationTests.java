package org.ecom.product;

import org.ecom.product.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

  @Test
  void contextLoads() {
  }

  private Product createProduct() {
    return Product.builder()
        .id(1L)
        .price(10.0)
        .name("Monitor")
        .description("Curved monitor 32''")
        .build();
  }
}
