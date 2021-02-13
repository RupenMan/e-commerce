package org.ecom.product.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
  @Id @GeneratedValue private Long id;
  private String productName;
  private String productDesc;
  private Double price;
  private List<Picture> pictures;
}
