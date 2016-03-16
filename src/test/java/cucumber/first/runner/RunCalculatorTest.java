package cucumber.first.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "cucumber.first.steps",
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}
