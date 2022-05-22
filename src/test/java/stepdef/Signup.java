package stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup extends BaseClass{
	//WebDriver driver;
	@Given("User must be on homepage url")
	public void user_must_be_on_homepage_url() {
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");	
		//driver = new FirefoxDriver(); 
	    //driver.get(string);
		initiation();
	    driver.get(prop.getProperty("url"));
	}

	@When("User clicks on Singup button")
	public void user_clicks_on_singup_button() throws InterruptedException {
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
	}

	@When("Enters Username and Password")
	public void enters_username_and_password() {
	    driver.findElement(By.id("sign-username")).sendKeys(prop.getProperty("username"));
	    driver.findElement(By.id("sign-password")).sendKeys(prop.getProperty("password"));
	}

	@Then("Click on signup button")
	public void click_on_signup_button() throws InterruptedException {
	    driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	    Thread.sleep(2000);
	}

	@Then("Click on ok button in alert")
	public void click_on_ok_button_in_alert() {
	 // Alert al = driver.switchTo().alert();
	  //al.accept();
	  //driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-secondary")).click();
		driver.switchTo().alert().accept();
	}

}
