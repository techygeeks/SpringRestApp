package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/count")
    public String returnCountOfEmployees() {
    	System.out.println("hit");
        return "25";
    }
}
