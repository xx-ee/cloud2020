package com.xd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigCenterMain3344
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/26 15:19
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args) {
             SpringApplication.run(ConfigCenterMain3344.class,args);
         }
}
