package com.timing.xsystem.user.ct.testcase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-html-report/",
                "json:target/cucumber-html-report/report.json"
        },
        glue = {"com.timing.xsystem.user.ct.steps"},
        tags = {"@function, @exception"})
public class CucumberTest {

    @BeforeClass
    public static void setup() {
        System.setProperty("args", "-Dio=22");
    }
}
