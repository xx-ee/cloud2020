package com.xd.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/22 17:00
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//使用该注解赋予RestTemplate负载均衡能力，这样可以通过微服务名称来调用微服务
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
