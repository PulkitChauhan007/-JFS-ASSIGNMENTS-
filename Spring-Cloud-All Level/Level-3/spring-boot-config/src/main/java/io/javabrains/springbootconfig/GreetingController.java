package io.javabrains.springbootconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting}")
private String greetingMessage;
	
	@Value("some static value")
private String staticMessage;
//	
@Value("${my.list.values}")
	private List<String> listValues;

//@Value("#{${dbValues}}")
//private Map<String, String> dbValues;
	
	@Autowired
	private DbSettings dbSettings;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage + staticMessage + listValues + dbSettings.getConnection() + dbSettings.getHost()  ;// + dbValues; 
		
		
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
	}
	
}
