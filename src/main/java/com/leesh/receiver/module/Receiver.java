package com.leesh.receiver.module;

import com.leesh.receiver.dto.DeptDto;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="time", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="time-second"),
            key = "time-first" //sender 에서 보낸 routing key 값
    ))
    public void receiver1(String msg){
        System.out.println("<== [수신]receiver time : "+ msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="deptDto", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="deptDto-second"),
            key = "deptDto-first" //sender 에서 보낸 routing key 값
    ))
    public void receiver2(DeptDto deptDto){
        System.out.println("<== [수신]receiver deptDto : "+ deptDto.toString());
    }
}
