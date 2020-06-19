package com.timing.xsystem.user.ct.steps;

import com.timing.xsystem.user.Application;
import cucumber.api.java.en.And;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {Application.class},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@TestPropertySource("classpath:application-test.properties")
public class BaseSteps {

    @And("^Start the test env$")
    public void startSpringboot() {
        System.out.println("start the db or the redis.");
    }



}
