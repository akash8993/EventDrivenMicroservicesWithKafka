package com.akash.stockservice.kafka;

import com.akash.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger logger= LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "order_details", groupId = "stock")
    public void consume(OrderEvent orderEvent)
    {
        logger.info(String.format("Event received from producer is with message as %s, Order Status as %s, Order details as %s ",
                orderEvent.getMessage(), orderEvent.getStatus(), orderEvent.getOrder()));


    }

}
