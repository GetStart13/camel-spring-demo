package com.example.camel.test;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class MyBeanRouter extends RouteBuilder {
    @Override
    public void configure() {
        from("paho:amq/topic?brokerUrl=tcp://192.168.3.3:1883&userName=rabbitmq&password=123456")
                .bean("testConsumerBean", "showMessageByte");
    }
}
