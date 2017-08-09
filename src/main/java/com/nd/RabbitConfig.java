package com.nd;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/8/9.
 */
@Configuration
public class RabbitConfig {
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
