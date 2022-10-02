package com.oldrabbit.tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.oldrabbit.tutorial.config.Topics.my_topic;
import static com.oldrabbit.tutorial.config.Topics.my_topic_json;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic myTopic() {
        return TopicBuilder.name(my_topic)
                .build();
    }

    @Bean
    public NewTopic myTopicJson() {
        return TopicBuilder.name(my_topic_json)
                .build();
    }
}
