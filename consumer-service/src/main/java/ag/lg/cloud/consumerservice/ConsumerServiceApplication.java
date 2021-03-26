package ag.lg.cloud.consumerservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsumerServiceApplication {
	@Autowired
	private Consumer consumer;

	

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);
	}

	@GetMapping()
	  public Map<String, String> message() {
	    Map<String, String> response = new HashMap<>();
	    
	    response.put("message", consumer.getMessage());
	    response.put("global-message", consumer.getGlobalMessage());
	    
	    return response;
	  }
}
