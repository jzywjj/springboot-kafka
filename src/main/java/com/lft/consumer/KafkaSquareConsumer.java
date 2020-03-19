package com.lft.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.lft.config.ConstApi;

@Component
public class KafkaSquareConsumer {

	@KafkaListener(topics = ConstApi.K_Out_Stream,groupId = "kStream")
	public void consume(Long number) {
		System.out.println(String.format("Consumed :: %d", number));
	}

}
