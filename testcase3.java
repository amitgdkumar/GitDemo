import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.xpath("//a[contains(@class,'register')]")).click();
		driver.findElement(By.cssSelector("input[id*='user_e']")).sendKeys("amitgdkumar@gmail.com");
		driver.findElement(By.cssSelector("input[id*='user_p']")).sendKeys("123456");
		driver.findElement(By.name("commit")).click();
				
		driver.close();

	}

}
