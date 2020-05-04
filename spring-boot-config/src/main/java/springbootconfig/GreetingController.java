package springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	/**
	 * Inject the value of the member variable| Fetch value from propertyFile 
	 * Config microservice using @value 
	 */
	@Value("${my.greeting}")
	private String greetingMessage;
	
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage;
	}
	

}
