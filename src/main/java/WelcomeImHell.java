import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeImHell {

    @RequestMapping("/hellworld")
    String hell() {
        return "Welcome in Hell";

    }

    @Autowired
    private Timer timer;

    @RequestMapping("/helltime")
    String timeInHell() {
        return "Time in Hell: " + timer.Time();
    }
}
