package io.rabbitmq.CustomerNotification;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Custrepo extends MongoRepository<Customer,String> {

}