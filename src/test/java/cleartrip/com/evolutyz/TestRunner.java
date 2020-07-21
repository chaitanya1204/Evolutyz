package cleartrip.com.evolutyz;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/features"}, glue = {"cleartrip.com.evolutyz"}, tags = {"@testRun"})
public class TestRunner {

}
