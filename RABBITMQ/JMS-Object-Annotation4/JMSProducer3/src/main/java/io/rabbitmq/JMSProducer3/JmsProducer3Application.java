package io.rabbitmq.JMSProducer3;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JmsProducer3Application
{
	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitmqConfig.class);
		RabbitTemplate rabbitTemplate = (RabbitTemplate) ctx.getBean("rabbitTemplate");

		Product product = new Product();
		product.setProductId(100);
		product.setName("Laptop");
		product.setQuantity(10);
		
		rabbitTemplate.convertAndSend(queueName, product);
		System.out.println("product object has been sent successfully to Queue");

		ctx.close();
	}
}