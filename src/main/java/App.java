import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/helloworld")
    String home(){
        return "Hello World i want to be a programmer !!!";
    }




    public static void main(String[] args) throws Exception{

        SpringApplication.run(new Object[] {LondonTime.class,App.class, WelcomeImHell.class,Timer.class}, args);

    }
}
