package guru.springframework.spring6depinj.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey i am setting a Greeting !!!";
    }
}
