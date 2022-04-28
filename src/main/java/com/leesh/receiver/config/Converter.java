package com.leesh.receiver.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Converter {
    //rabbit mq로 객체를 전송,수신 하기 위해서 필요한 컨버터 (객체를 byte[]로 직렬화 / String 과 byte[] 만 전송가능)
    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
