package com.firstspring.demospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// we annotate them so that the spring knows it is a controller
@RestController
public class HomeController {

    // these annotations tells spring what url we are mapping it to
    // and what should happen in these urls
    @GetMapping("/")
    public String homePage() {
        return "HomePage";
    }

    // tells the spring framework that whenever theres a request to this url, this
    // method should be run
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi!";
    }
}
