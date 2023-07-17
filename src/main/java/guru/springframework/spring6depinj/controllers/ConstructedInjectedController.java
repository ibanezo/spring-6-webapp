package guru.springframework.spring6depinj.controllers;

import guru.springframework.spring6depinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructedInjectedController {

    private final GreetingService greetingService;

    public ConstructedInjectedController(@Qualifier("greetingServicePrimary") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
