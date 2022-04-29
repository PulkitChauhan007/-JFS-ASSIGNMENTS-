package io.rabbitmq.Customer;


import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerService {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public String bookcustomer(@RequestBody Customer customer) {
        customer.setCostumerId("10");
        System.out.println(customer);
        template.convertAndSend(CustomerConfiguration.EXCHANGE, CustomerConfiguration.ROUTING_KEY, customer);
        return "Message Sent";
    }
    @GetMapping("/get")
    public Customer getc(){
        Customer c = new Customer();
        c.setCostumerId(UUID.randomUUID().toString());
        c.setAge(22);
        c.setName("Pulkit");
        return  c ;
    }
}