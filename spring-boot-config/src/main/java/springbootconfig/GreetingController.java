package springbootconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	/**
	 * Inject the value of the member variable| Fetch value from propertyFile 
	 * Config microservice using @value 
	 */
	@Value("${my.greeting: default value}")
	private String greetingMessage;
	
	@Value("some static message")
	private String staticMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Autowired
	private DbSettings dbSettings;
	/**
	 * Default constructor
	 */
	public GreetingController() {
		
	}
	
	/**
	 * Greeting 
	 * @return greetingMessage
	 */
	@GetMapping("/greeting")
	public String greeting() {
		return dbSettings.getConnection() + dbSettings.getHost() ;
	}
	

}
