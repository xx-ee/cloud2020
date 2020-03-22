package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7001
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/22 21:16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7001.class,args);
         }
}
