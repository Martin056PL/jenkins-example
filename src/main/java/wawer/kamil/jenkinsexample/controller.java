package wawer.kamil.jenkinsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/test")
    public String get(){
        return "TEST ELOWINA";
    }
}
