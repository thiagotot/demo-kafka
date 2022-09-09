package com.emp.demo;

import com.alianca.intercab.emp.transactionreturn.Place;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private String topicName;

    private final KafkaTemplate<String, Place> kafkaTemplate;

    public void send(String message) {
        topicName = "ANL.intercab.transactionreturn.topic.internal.any.v1";
        log.info("Payload enviado: {}", message);

        Place place = new Place();
        place.setReturnCode("A");
        place.setTransactionId(1);
        place.setExternalSystemName("Teste");


        kafkaTemplate.send(topicName, place);
    }

}

