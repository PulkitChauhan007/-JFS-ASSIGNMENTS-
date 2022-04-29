package io.rabbitmq.SpringBootJMSReceiver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJmsReceiverApplication
{

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(SpringBootJmsReceiverApplication.class, args);
	}

}