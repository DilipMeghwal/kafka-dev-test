package com.dm;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "dm",
            groupId = "groupId"
    )
    public void listener(String data){
        System.out.println("Listener Received : " + data);
    }
}
