package guru.springframework.spring6depinj.controllers;

import guru.springframework.spring6depinj.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructedInjectedControllerTest {

    @Autowired
    ConstructedInjectedController constructedInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructedInjectedController.sayHello());
    }
}