package com.sindalah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sindalah.service.KafkaProducer;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {

	@Autowired
	KafkaProducer kafkaSender;

	@GetMapping("/producer")
	public String produceMessage(@RequestParam("message") String message) {

		kafkaSender.send(message);
		return "Message sent to the Kafka Topic Successfully";
	}
}
