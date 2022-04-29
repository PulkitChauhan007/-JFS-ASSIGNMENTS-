package io.rabbitmq.SpringBootJMSproducer2;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJmsProducer2Application implements CommandLineRunner
{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(SpringBootJmsProducer2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Product product = new Product();
		product.setProductId(102);
		product.setName("Apple Laptop");
		product.setQuantity(10);
		
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(Configuration.topicExchangeName,
				"message_routing_key", product);
		System.out.println("Message sent successfully...");
	}

}