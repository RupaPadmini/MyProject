package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ravik\\Desktop\\Testing\\Project\\src\\test\\java\\feature",
glue = {"stepdef"}, plugin = {"pretty","html:target/HTmlreports.html"}, monochrome = true)


public class TestRunner {
	
	

}
