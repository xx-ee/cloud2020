package com.xd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: SeataAccountMain2001
 * @Description: 取消数据源的自动配置
 * @Author: xiedong
 * @Date: 2020/3/30 17:08
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataAccountMain2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMain2001.class, args);
    }
}
