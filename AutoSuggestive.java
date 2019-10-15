import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\boyko\\Documents\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/"); // URL in the browser
		WebElement source = driver.findElement(By.id("fromCity"));
		source.click();

		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromCity.sendKeys("PUNE");
		Thread.sleep(2000);

		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		WebElement destination = driver.findElement(By.id("toCity"));
		destination.sendKeys("DEL");

		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toCity.sendKeys("DEL");
		Thread.sleep(2000);

		toCity.sendKeys(Keys.ARROW_DOWN);
		toCity.sendKeys(Keys.ENTER);

	}

}
