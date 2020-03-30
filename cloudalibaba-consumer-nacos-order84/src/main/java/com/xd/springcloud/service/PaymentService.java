package com.xd.springcloud.service;

import com.xd.springcloud.entities.CommonResult;
import com.xd.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * @ClassName: PaymentService
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/29 23:32
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
