package StepsDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Cucumber/Features", plugin = {"pretty", "html:out.html"})

public class Task2Test{
}
