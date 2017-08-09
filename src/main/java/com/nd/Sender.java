package com.nd;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/9.
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context="hello"+new Date();
        System.out.println("Sender:"+context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
