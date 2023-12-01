package org.analysis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
    @GetMapping("/home")
    public String getHome(){
        return "test resource home output!";
    }
}
