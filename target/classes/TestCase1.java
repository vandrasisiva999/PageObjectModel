import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String args[]) throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhanuJyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver wd = new ChromeDriver();
		wd.get("https://www.wellsfargo.com");
		Thread.sleep(100);
		WebElement search = wd.findElement(By.id("userid"));
		search.sendKeys("Wellsfargo");
	}
	
}
