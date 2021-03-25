package ag.lg.cloud.consumerservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Consumer {
  @Value("${message}")
  private String message;
  
  @Value("${global-message}")
  private String globalMessage;
  
  @GetMapping()
  public Map<String, String> message() {
    Map<String, String> response = new HashMap<>();
    
    response.put("message", message);
    response.put("global-message", globalMessage);
    
    return response;
  }
}