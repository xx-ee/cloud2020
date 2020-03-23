package com.xd.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyRule
 * @Description: 自定义负载均衡路由规则类
 * @Author: xiedong
 * @Date: 2020/3/23 20:48
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 定义为随机
//        return new RoundRobinRule();
        return new RandomRule();
    }
}
