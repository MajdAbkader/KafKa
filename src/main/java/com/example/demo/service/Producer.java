package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	public static final String topic = "mytopic" ;
	
	private static final Logger log = LoggerFactory.getLogger(Producer.class);

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp ;
    
	public void publishToTopic (String message) {
	
		this.kafkaTemp.send(topic, message) ;
		log.info("Publishing to topid" +topic);
	
}
}