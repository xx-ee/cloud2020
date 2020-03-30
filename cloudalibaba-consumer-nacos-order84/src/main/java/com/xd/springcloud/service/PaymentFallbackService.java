package com.xd.springcloud.service;

import com.xd.springcloud.entities.CommonResult;
import com.xd.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/29 23:32
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444, "fallback",new Payment(id,"errorSerial"));
    }
}
