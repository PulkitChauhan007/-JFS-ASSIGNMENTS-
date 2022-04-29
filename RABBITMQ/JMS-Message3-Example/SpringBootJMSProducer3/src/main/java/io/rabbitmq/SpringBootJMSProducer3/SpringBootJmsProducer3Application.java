package io.rabbitmq.SpringBootJMSProducer3;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJmsProducer3Application implements CommandLineRunner
{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(SpringBootJmsProducer3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(Configuration.topicExchangeName,
				"message_routing_key", "Hello from RabbitMQ 22222!");
		System.out.println("Message sent successfully...");
	}

}
