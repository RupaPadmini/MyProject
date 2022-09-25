package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	//Browser Info WebDriver driver = new ChromeDriver();
		//Url info
		//Username and password
	    public static Properties prop = new Properties();
	    public static WebDriver driver;
	    //Step 1
	    public BaseClass() {
	    	try {
	    	
	    	FileInputStream file = new FileInputStream("C:\\Users\\ravik\\Desktop\\Testing\\Project\\src\\test\\java\\environmentsetup\\Config.properties");
	    	 prop.load(file);
	    	}
	    	catch(FileNotFoundException e) {
	    		e.printStackTrace();
	    	}
	    	catch(IOException a) {
	    		a.printStackTrace();
	    	}
	    }
	   
	    //Step 2
	    public static void initiation() {
	    	//driver path 
	    	//maximise, pageload, implicit , getting url
	    	//if browser = chrome  webdriver.chrome.driver
	    	//else if browser = Firefox webdriver.gecko.driver
	    	String browsername = prop.getProperty("browser");
	    	if(browsername.equals("chrome")) {
	    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    		driver = new ChromeDriver();
	    	}
	    		else if(browsername.equals("Firefox")) {
	    		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");	
	    		driver = new FirefoxDriver();  	    		
	    	}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    	//driver.get(prop.getProperty("url"));
	    } 

}
