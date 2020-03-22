package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7002
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/22 21:19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7002.class,args);
         }
}
