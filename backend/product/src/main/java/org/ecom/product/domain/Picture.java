package org.ecom.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Picture {
  private Long id;
  private Integer width;
  private Integer height;
  private String path;
  private Integer order;
}
