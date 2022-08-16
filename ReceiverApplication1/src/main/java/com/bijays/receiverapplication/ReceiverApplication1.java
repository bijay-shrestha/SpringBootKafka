package com.bijays.receiverapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ReceiverApplication1 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverApplication1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Receiver is running and waiting for message");
    }
}
