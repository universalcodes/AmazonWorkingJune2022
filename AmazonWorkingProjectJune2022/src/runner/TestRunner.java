package runner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;

@CucumberOptions(
features = "C:\\Users\\yoges\\eclipse-workspace\\DummyAutomation\\AmazonFeature\\", 
glue = { "com.selenium_FeatureSteps" }, 
dryRun = false,
monochrome = false,
strict = false,
plugin = { "pretty", "json:target/cucumber.json" },
tags = { "@AmazonValidLogin"}
)




public class TestRunner extends AbstractTestNGCucumberTests {

	
}
