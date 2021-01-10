package in.developersera.springbootwithdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home(){
        System.out.println("inside /");
        return "Hello world, this msg is from spring boot controller docker";
    }
}
