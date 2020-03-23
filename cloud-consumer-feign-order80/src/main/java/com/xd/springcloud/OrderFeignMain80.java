package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignMain80
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/23 21:58
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignMain80 {
     public static void main(String[] args) {
             SpringApplication.run(OrderFeignMain80.class,args);
         }
}
