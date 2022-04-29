package io.rabbitmq.CustomerNotification;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	
	 @Autowired
	    private Transactions transactions;
	 
    @RabbitListener(queues = CustomerConfiguration.QUEUE)
    public void consumeMessageFromQueue(Customer c) {
        System.out.println("Message recieved from queue : " + c);
        Customer customer = transactions.saveCustomer(c);
    }
}