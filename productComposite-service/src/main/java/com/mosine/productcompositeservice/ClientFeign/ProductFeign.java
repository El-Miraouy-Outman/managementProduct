package com.mosine.productcompositeservice.ClientFeign;


import com.mosine.productcompositeservice.models.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", path = "/api/products", url = "http://localhost:9090")
public interface ProductFeign {
    @GetMapping("/{idProduct}")
    public Product getProduct(@PathVariable Long idProduct);
}
