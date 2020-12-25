package com.eureka.consume.consumesecond.controller;


import com.eureka.consume.consumesecond.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RebbonTestController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable String id) {
        return this.restTemplate.getForObject("http://consume-first/getUserTest/" + id, User.class);
    }

    @GetMapping("/test")
    public String test(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("consume-first");
        System.out.println("CONSUME_SECOND_TEST:");
        System.out.println("HOST : "+serviceInstance.getHost());
        System.out.println("INSTANCEID : "+serviceInstance.getInstanceId());
        System.out.println("METADATA : "+serviceInstance.getMetadata());
        System.out.println("PORT : "+serviceInstance.getPort());
        System.out.println("SERVICEID : "+serviceInstance.getServiceId());
        System.out.println("URI : "+serviceInstance.getUri());
        System.out.println("END:");

        return "CONSUME_SECOND_TEST";
    }


}
