package com.mosine.productcompositeservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {

        private Long review_id;

        private Long product_id;

        private String author;

        private String subject;

        private String content;

}
