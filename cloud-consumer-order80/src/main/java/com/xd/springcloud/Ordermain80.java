package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: Ordermain80
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/22 17:00
 */
@SpringBootApplication
@EnableEurekaClient
public class Ordermain80 {
     public static void main(String[] args) {
             SpringApplication.run(Ordermain80.class,args);
         }
}
