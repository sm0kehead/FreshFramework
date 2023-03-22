package project;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
//        glue= {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        monochrome = true,
        tags = "@tag1"
)

public class TestRunner {

}

