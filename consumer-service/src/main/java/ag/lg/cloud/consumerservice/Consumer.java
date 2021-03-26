package ag.lg.cloud.consumerservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Consumer {
	@Value("${message}")
	private String message;

	@Value("${global-message}")
	private String globalMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGlobalMessage() {
		return globalMessage;
	}

	public void setGlobalMessage(String globalMessage) {
		this.globalMessage = globalMessage;
	}

}