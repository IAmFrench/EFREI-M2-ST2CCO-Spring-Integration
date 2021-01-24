package test;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class NameGenerator implements FileNameGenerator {

    public String generateFileName(Message<?> message) {

        return ((String) message.getHeaders().get("file_name")).split("\\.")[0] + ".json";
    }
}
