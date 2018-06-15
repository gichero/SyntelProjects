import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class Main {

    @RequestMapping("/")
    @ResponseBody

    String main(){
        return "Hello, World!!";
    }

    public static void main(String[] args) {
        // write your code here
        SpringApplication.run(Main.class, args);
    }
}
