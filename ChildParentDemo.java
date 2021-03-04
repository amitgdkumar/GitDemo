import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
		Set<String> windowsList = driver.getWindowHandles();
		Iterator<String> it = windowsList.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
