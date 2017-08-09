package com.nd;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/9.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}
