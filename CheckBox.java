import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\boyko\\Documents\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://spicejet.com");
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("familyandfriend")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input:checked[type='checkbox']")).size());
	}

}
