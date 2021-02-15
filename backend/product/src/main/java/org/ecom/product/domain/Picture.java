package org.ecom.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Picture {

  @Id
  @GeneratedValue
  private Long id;
  private Integer width;
  private Integer height;
  private String path;

  @JsonProperty("image_order")
  private Integer imageOrder;
}
