package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderConsulMain80
 * @Description: 消费者注册至Consul
 * @Author: xiedong
 * @Date: 2020/3/23 15:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
     public static void main(String[] args) {
             SpringApplication.run(OrderConsulMain80.class,args);
         }
}
