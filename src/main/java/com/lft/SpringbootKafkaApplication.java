package com.lft;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootKafkaApplication implements CommandLineRunner {

	public static Logger logger = LoggerFactory.getLogger(SpringbootKafkaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
	}

	@Autowired
	private KafkaTemplate<String, Long> template;


	@Override
	public void run(String... args) throws Exception {
//		this.template.send("helloWorld", 1222);
//		this.template.send("helloWorld", 456);
//		this.template.send("helloWorld", 789);
		
	}

	@KafkaListener(topics = "helloWorld",groupId = "hello")
	public void listen(ConsumerRecord<?, ?> cr) throws Exception {
		logger.info("================"+cr.toString());
	}
	
}
