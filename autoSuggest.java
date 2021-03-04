import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("rgd");
		 driver.findElement(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td[2]/input")).click();
		// driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		 
		 System.out.println(driver.manage().window().getClass());
		 driver.manage().window().maximize();
		

	}

}
