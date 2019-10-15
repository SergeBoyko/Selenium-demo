

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\boyko\\Documents\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=ca&.lang=en-CA&.done=https%3A%2F%2Fca.yahoo.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("login-username")).sendKeys("serge.boyko@yahoo.fr");
	driver.findElement(By.id("login-username")).click();
	String at = driver.getTitle();
	System.out.println(at);
	String et = "Yahoo - login";
	driver.close();
	
	if(at.equalsIgnoreCase(et)) {
	System.out.println("Test Successful");
	}
	else {
		System.out.println("Test fail");
	}
 }
}
