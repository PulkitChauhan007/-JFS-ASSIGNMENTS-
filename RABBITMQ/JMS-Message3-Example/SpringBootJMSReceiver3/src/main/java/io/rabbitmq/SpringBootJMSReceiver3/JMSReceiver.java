package io.rabbitmq.SpringBootJMSReceiver3;

import org.springframework.stereotype.Component;

@Component
public class JMSReceiver
{
	public void receiveMessage(String message)
	{
		System.out.println("Received <" + message + ">");
	}
}