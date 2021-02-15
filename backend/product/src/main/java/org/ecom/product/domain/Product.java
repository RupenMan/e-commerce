package org.ecom.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "category_id")
  @JsonProperty("category_id")
  private Long categoryId;

  private String name;
  private String description;
  private Double price;

  @OneToMany(targetEntity = Picture.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<Picture> pictures;
}
