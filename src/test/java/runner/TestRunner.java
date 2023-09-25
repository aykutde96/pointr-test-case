package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"json:target/cucumber-reports/cucumber.json", "pretty",
        "html:target/cucumber-reports/cucumberReport.html"},
        glue = {"steps", "base"})

public class TestRunner {
}
