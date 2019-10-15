
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {

//System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
//
//WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\boyko\\Documents\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

//driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		for (int i = 0; i < count; i++)

		{

//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println("i : " + i);
			System.out.println("text : " + text);
			if (text.equals("Milk"))

			{
				System.out.println("Beer i : " + i);
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			}

		}

	}

}