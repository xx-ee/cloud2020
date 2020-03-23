package com.xd.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName: LoadBalancer
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/23 20:48
 */
public interface LoadBalancer {
    /**
     * 获取存活的服务实例列表
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
