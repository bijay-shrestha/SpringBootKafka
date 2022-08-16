package com.bijays.senderapplication;

import com.bijays.senderapplication.service.Sender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SenderApplication implements CommandLineRunner {

	private final Sender sender;

	public SenderApplication(Sender sender) {
		this.sender = sender;
	}

	public static void main(String[] args) {
		SpringApplication.run(SenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send("topicA", "Hello Kafka");
		System.out.println("Message has been sent");
	}
}
