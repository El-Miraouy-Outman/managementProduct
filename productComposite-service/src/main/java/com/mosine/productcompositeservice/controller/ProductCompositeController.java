package com.mosine.productcompositeservice.controller;


import com.mosine.productcompositeservice.ClientFeign.ProductFeign;
import com.mosine.productcompositeservice.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/productComposites")
public class ProductCompositeController {

    private final ProductFeign productFeign;

    @GetMapping("/test")
    public Product getProduct(){
        return productFeign.getProduct(1L);
    }

}
