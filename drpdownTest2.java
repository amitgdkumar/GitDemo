import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdownTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select list = new Select(dropDown);
		
		list.selectByIndex(5);
		
		dropDown = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		list = new Select(dropDown);
		
		list.selectByVisibleText("3");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		

	}
	
	void testGit()
	{
		Barbie Srivastava
		Barbie Srivastava
		Barbie Srivastava
		Barbie Srivastava
		Barbie Srivastava
	}

}
