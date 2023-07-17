package guru.springframework.spring6depinj.controllers;

import guru.springframework.spring6depinj.services.GreetingService;
import guru.springframework.spring6depinj.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    // This is without using Dependency Injection, not recommended!
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the controller!");
        return greetingService.sayGreeting();
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After init called by Bean Post Processor");
    }
}
