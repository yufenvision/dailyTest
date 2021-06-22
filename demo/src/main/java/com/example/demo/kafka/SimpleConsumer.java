package com.example.demo.kafka;

import com.example.demo.entity.TestPO;
import com.example.demo.mapper.TestMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/6/21 19:54
 */
@Component
public class SimpleConsumer {

    @Autowired
    private TestMapper testMapper;

    // 消费监听
    @KafkaListener(topics = {"topic1"})
    public void onMessage1(ConsumerRecord<?, ?> record){

        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费："+record.topic()+"-"+record.partition()+"-"+record.value());
        TestPO testPO = TestPO.builder().name(record.value().toString()).build();
        testMapper.insert(testPO);
    }
}
