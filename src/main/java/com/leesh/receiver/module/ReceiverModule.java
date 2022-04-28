package com.leesh.receiver.module;

import com.leesh.receiver.dto.DeptDto;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ReceiverModule {

    //text 메세지 receiver
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="time", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="time-second"), //현재 receiver의 value 임의 설정
            key = "time-first" //sender 에서 보낸 routing key 값
    ))
    public void receiver1(String msg){
        System.out.println("<== [수신]receiver time : "+ msg);
    }


    //DeptDto 객체 receiver
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name="deptDto", type = ExchangeTypes.TOPIC), //sender 에서보낸 exchange 값
            value = @Queue(name="deptDto-2"), //현재 receiver의 value 임의 설정
            key = "deptDto-1" //sender 에서 보낸 routing key 값
    ))
    @SendTo("deptDto/deptDto-3") //수신받은 후 다시 리턴전송하기
    //deptDto 는 exchange , deptDto-third 는 key는  를 의미함.
    public DeptDto receiver2(DeptDto deptDto){
        System.out.println("<== 2.[수신]receiver deptDto : "+ deptDto.toString());
        deptDto.setDeptNo(2);
        System.out.println("==> 3.[발신]receiver deptDto : "+ deptDto.toString());
        return deptDto;
    }
}
