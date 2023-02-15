package com.sindalah.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.sindalah.service.KafkaProducer;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaProducerImpl implements KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	String kafkaTopic = "java_topic";

	@Override
	public void send(String message) {
		log.info("Publishing message");
		kafkaTemplate.send(kafkaTopic, message);

	}

}
