package DI;

import org.springframework.stereotype.Service;

@Service
public class Message {
    public String getMessage() {
        return "Hello, World!";
    }
}