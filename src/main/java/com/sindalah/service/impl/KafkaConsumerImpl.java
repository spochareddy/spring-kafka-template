package com.sindalah.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sindalah.service.KafkaConsumer;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumerImpl implements KafkaConsumer {

	@KafkaListener(topics = "java_topic", groupId = "group_id")
	public void consume(String message) {
		log.info("Consumed message = " + message);
	}

}
