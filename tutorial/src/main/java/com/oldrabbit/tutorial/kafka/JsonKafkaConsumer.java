package com.oldrabbit.tutorial.kafka;

import com.oldrabbit.tutorial.config.Topics;
import com.oldrabbit.tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = Topics.my_topic_json, groupId = "myGroup")
    public void consume(User user) {    // <-- JsonDeserializer provided by Spring Kafka will convert User JSON object into Java User object
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
