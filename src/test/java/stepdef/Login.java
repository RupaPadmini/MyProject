package stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import junit.framework.Assert;

public class Login extends BaseClass{
	//WebDriver driver;
	@Given("User must be on homepage by clicking on url")
	public void user_must_be_on_homepage_by_clicking_on_url() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    //driver = new ChromeDriver();
	   // driver.get(string);
		initiation();
	    driver.get(prop.getProperty("url"));
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("login2")).click();
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
	    driver.findElement(By.id("loginusername")).sendKeys(prop.getProperty("username"));
	    driver.findElement(By.id("loginpassword")).sendKeys(prop.getProperty("password"));
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.cssSelector("#logInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
	}

	@Then("User account should be opened")
	public void user_account_should_be_opened() throws InterruptedException {
		String actualres = driver.getCurrentUrl();
		Assert.assertEquals("https://demoblaze.com/", actualres);
		Thread.sleep(2000);
	}
	
	@When("Click on Laptops")
	public void click_on_laptops() {
	    driver.findElement(By.linkText("Laptops")).click();
	}

	@When("Click on any Laptop name")
	public void click_on_any_laptop_name() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("div.col-md-6:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")).click();
	}


	@Then("Click on Add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
		
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a.btn")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
			    
	}

	@Then("Click on Cart button to verify the product is added")
	public void click_on_cart_button_to_verify_the_product_is_added() {
	    driver.findElement(By.id("cartur")).click();
	    
	}

}
