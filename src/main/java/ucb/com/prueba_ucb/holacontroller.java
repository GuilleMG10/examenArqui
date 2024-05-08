package ucb.com.prueba_ucb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class holacontroller {
    @GetMapping("/")
    String hola() {
        return "hola munco con springboot";
    }
    
    
}
