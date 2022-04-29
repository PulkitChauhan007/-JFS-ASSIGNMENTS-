package io.rabbitmq.JMSReceiver3;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JmsReceiver3Application
{
	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitmqConfig.class);
		MessageReceiver receiver = (MessageReceiver) ctx.getBean("receiver");
		receiver.getCountDownLatch().await(200000, TimeUnit.SECONDS);
	}
}
