import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("amitgdp");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		driver.findElement(By.cssSelector("input#Login")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.close();

	}

}
