package com.infy.user.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserKafkaProducer {

    private static final String TOPIC = "user-topic";

    @Autowired
    private KafkaTemplate<String, UserEvent> kafkaTemplate;


    public void sendUserEvent(UserEvent event) {
        kafkaTemplate.send(TOPIC, event);
    }

}
