package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources"},
		plugin = {"pretty", "html:target/report.html", "junit:target/rep1.xml", "json:target/rep2.json"}
		)

public class TestRunner {

}
