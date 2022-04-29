package io.rabbitmq.SpringBootJMSreceiver2;

import org.springframework.stereotype.Component;

@Component
public class JMSReceiver
{
	public void receiveMessage(Product Product)
	{
		System.out.println("Received <" + Product + ">");
	}
}