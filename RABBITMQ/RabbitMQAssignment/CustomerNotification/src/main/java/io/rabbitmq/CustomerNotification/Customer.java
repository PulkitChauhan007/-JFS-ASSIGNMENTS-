package io.rabbitmq.CustomerNotification;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer {

	 private String costumerId;
	    private String name;
	    private int age;
		public Customer(String costumerId, String name, int age) {
			super();
			this.costumerId = costumerId;
			this.name = name;
			this.age = age;
		}
		public Customer() {}
		public String getCostumerId() {
			return costumerId;
		}
		public void setCostumerId(String costumerId) {
			this.costumerId = costumerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
