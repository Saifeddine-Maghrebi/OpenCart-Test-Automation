package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/features",
        glue = {"step_definitions", "hooks"},
        plugin = {"pretty","html:target/cucumber-reports.html"}
)



public class TestRunner {
}
