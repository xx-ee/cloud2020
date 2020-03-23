package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8004
 * @Description: zookeeper替换Eureka
 * @Author: xiedong
 * @Date: 2020/3/23 12:16
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使consul或zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentMain8004.class,args);
         }
}
