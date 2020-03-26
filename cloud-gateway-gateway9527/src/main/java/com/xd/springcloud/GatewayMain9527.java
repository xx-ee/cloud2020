package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: GatewayMain9527
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/26 13:04
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
     public static void main(String[] args) {
             SpringApplication.run(GatewayMain9527.class,args);
         }
}
