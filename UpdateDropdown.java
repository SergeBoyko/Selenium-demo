import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\boyko\\Documents\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefInAdt")).click(); // 4times
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
// test
	}

}
