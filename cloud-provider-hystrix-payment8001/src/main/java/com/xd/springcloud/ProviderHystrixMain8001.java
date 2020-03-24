package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ProviderHystrixMain8001
 * @Description: @EnableCircuitBreaker:启用hystrix服务降级
 * @Author: xiedong
 * @Date: 2020/3/24 21:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class ProviderHystrixMain8001 {
     public static void main(String[] args) {
             SpringApplication.run(ProviderHystrixMain8001.class,args);
         }
}
