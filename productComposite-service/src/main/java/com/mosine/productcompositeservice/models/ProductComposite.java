package com.mosine.productcompositeservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductComposite {
   private Product product;
   private List<Review> reviewList;
   private List<Recommandation> recommandationList;

}
