package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderZkMain80
 * @Description: 消费者注册至zookeeper
 * @Author: xiedong
 * @Date: 2020/3/23 13:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {
     public static void main(String[] args) {
             SpringApplication.run(OrderZkMain80.class,args);
         }
}
