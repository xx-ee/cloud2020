package com.xd.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: Payment
 * @Description: 统一返回对象
 * @Author: xiedong
 * @Date: 2020/3/22 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    /**
     * 支付流水号
     */
    private String serial;
}
