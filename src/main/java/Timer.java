import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class Timer {

    public LocalDateTime Time(){
        return LocalDateTime.now();
    }
}
