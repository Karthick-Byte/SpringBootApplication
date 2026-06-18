package com.infy.address.kafka;


import com.infy.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserEventConsumer {

    @Autowired
    private AddressService addressService;

    @KafkaListener(topics = "user-topic", groupId = "address-group")
    public void consume(UserEvent event) {
        System.out.println("Received event: " + event);
        // Call service layer
        addressService.createAddressFromEvent(event);
    }

}
