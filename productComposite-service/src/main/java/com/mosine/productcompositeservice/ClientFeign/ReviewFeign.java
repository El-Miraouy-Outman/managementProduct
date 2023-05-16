package com.mosine.productcompositeservice.ClientFeign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "review-service", path = "/api/reviews", url = "http://localhost:7002")
public interface ReviewFeign {

}
