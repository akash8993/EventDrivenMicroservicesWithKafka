package com.akash.orderservice.producer;

import com.akash.basedomains.dto.OrderEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderProducer {

    private static final Logger logger= LoggerFactory.getLogger(KafkaOrderProducer.class);
    private NewTopic newTopic;
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;
    public KafkaOrderProducer(NewTopic newTopic, KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.newTopic = newTopic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(OrderEvent event)
    {
        logger.info(String.format("Event send that can be consume by other service -> ",event.toString()));

        //create Message
        Message<OrderEvent> message= MessageBuilder.withPayload(event).
                setHeader(KafkaHeaders.TOPIC,newTopic.name())
                .build();
    }


}
