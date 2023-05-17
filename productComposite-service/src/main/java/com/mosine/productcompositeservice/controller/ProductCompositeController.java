package com.mosine.productcompositeservice.controller;


import com.mosine.productcompositeservice.ClientFeign.ProductFeign;
import com.mosine.productcompositeservice.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/productComposites")
public class ProductCompositeController {

    private final ProductFeign productFeign;

    @GetMapping("/getprduit/{id}")
    public Product getProduct(@PathVariable Long id){
        return productFeign.getProduct(id);
    }

    @GetMapping("/teste")
    public String teste(){
        return "succes";
    }
    @GetMapping("/saveproduct")
    public Product saveProduct(@RequestBody Product product){
        return productFeign.saveProduct(product);
    }
}
