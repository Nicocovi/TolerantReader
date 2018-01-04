package provider;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ServiceProviderController {
    
    @RequestMapping("/")
    public String index() {
        return "I am the Service Provider";
    }
    
}
