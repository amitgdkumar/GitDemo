import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinkInPage {
	
	public void test1()
	{
		Amit Kumar Srivastava
		Amit Kumar Srivastava
		Amit Kumar Srivastava
		Amit Kumar Srivastava
		Amit Kumar Srivastava
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='usefullLinks']"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//footerDriver.findElement(By.tagName("a")).click();
		WebElement rowDriver = footerDriver.findElement(By.xpath("//div[@id='usefullLinks']/div[4]/div"));
		System.out.println(rowDriver.findElements(By.tagName("a")).size());
		
		for (int i=0; i<rowDriver.findElements(By.tagName("a")).size(); i++)
		{
			rowDriver.findElements(By.tagName("a")).get(i).click();
		}
	}
	
	public void test1()
	{
		Rinku Srivastava
		Rinku Srivastava
		Rinku Srivastava
		Rinku Srivastava
		Rinku Srivastava
	}

}
