package com.jboard.ota.api.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Order(4)
@Component
public class KeycloakConsumer {
    @KafkaListener(
            topicPartitions = @TopicPartition(
                    topic = "ota.dev.keycloak.users",
                    partitionOffsets = { @PartitionOffset(partition = "0", initialOffset = "0") }
            ),
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void listenToPartition(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION) String partition
    ) {
        log.info("Received message: {} from: {}", message, partition);
    }
}
