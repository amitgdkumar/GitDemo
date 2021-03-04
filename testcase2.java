
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write code here
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.google.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close(); // Closes current tab
		//driver.quit();  // Closes all browsers opened by selenium
		
		/*driver.findElement(By.id("email")).sendKeys("amitgdkumar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.name("login")).click();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Amit Shah");
		driver.findElement(By.name("btnk")).click();*/

	}

}

