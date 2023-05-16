package com.mosine.productcompositeservice.ClientFeign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "recommandation-service", path = "/api/recommandations", url = "http://localhost:7003")
public interface RecommandationFeign {
}
