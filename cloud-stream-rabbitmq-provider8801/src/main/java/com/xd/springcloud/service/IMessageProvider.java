package com.xd.springcloud.service;

/**
 * 消息生产者
 */
public interface IMessageProvider {
    /**
     * 消息发送
     * @return
     */
    String send();
}
