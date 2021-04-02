package ag.lg.cloud.consumerservice;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsumerServiceApplication {
	private final Logger logger = org.slf4j.LoggerFactory.getLogger(ConsumerServiceApplication.class);

	@Autowired
	private Consumer consumer;

	

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);
	}

	@GetMapping()
	  public Map<String, String> message() {
	    Map<String, String> response = new HashMap<>();
	    logger.info("mi mensaje ", consumer.getMessage());
	    response.put("message", consumer.getMessage());
	    response.put("global-message", consumer.getGlobalMessage());
	    
	    return response;
	  }
}
