package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8006
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/23 14:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentMain8006.class,args);
         }
}
