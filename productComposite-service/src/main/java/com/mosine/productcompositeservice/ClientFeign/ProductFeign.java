package com.mosine.productcompositeservice.ClientFeign;


import com.mosine.productcompositeservice.models.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "product-service", path = "/api/products", url = "http://localhost:9090/product-service")
public interface ProductFeign {
    @GetMapping("/{idProduct}")
    public Product getProduct(@PathVariable Long idProduct);

    @PostMapping
    public Product saveProduct(@RequestBody Product product);

    @GetMapping
    public List<Product> getAllProducts();
}
