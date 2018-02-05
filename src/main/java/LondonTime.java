import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RestController
public class LondonTime {
    @Autowired
    private Timer timer;

    @RequestMapping("/londontime")
    public String londonTime() {
        return "Czas w Londynie: " + timer.Time().atZone(ZoneId.of("Europe/London"));

    }


}
