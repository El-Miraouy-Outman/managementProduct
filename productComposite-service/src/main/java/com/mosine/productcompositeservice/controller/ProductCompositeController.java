package com.mosine.productcompositeservice.controller;


import com.mosine.productcompositeservice.ClientFeign.ProductFeign;
import com.mosine.productcompositeservice.ClientFeign.ReviewFeign;
import com.mosine.productcompositeservice.models.Product;
import com.mosine.productcompositeservice.models.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/productComposites")
public class ProductCompositeController {

    private final ProductFeign productFeign;
    private final ReviewFeign reviewFeign;


    @GetMapping("products/{idProduct}")
    public Product getProduct(@PathVariable Long idProduct) {
        System.out.println("test *******************");
        Product product = productFeign.getProduct(idProduct);

        Product product2 = Product.builder()
                .id(product.getId())
                .name(product.getName())
                .weight(product.getWeight())
                .build();

        return product2;
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        System.out.println(product);
        return productFeign.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productFeign.getAllProducts();
    }

    // Review

    @PostMapping("/reviews")
    @ResponseStatus(HttpStatus.CREATED)
    public void addReview(@RequestBody Review reviewRequest) {
        reviewFeign.addReview(reviewRequest);
    }


    @GetMapping("/reviews/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Review getReview(@PathVariable Long id) {
        System.out.println("test *******************");
        return reviewFeign.getReview(id);
    }


    @DeleteMapping("/reviews/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReview(Long id) {
        reviewFeign.deleteReview(id);
    }
}
