import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmitPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,2000)");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\priya\\Desktop\\Amit11.png"));
		
		file = driver.findElement(By.id("gf-BIG")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\priya\\Desktop\\Amit111.png") );
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int totalLink = footer.findElements(By.tagName("a")).size();
		System.out.println(totalLink);
		
		WebElement smallFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']//table//tbody//tr//td[1]"));
		int link = smallFooter.findElements(By.tagName("a")).size();
		List<WebElement> list = smallFooter.findElements(By.tagName("a"));
		System.out.println(link);
		
		Actions action = new Actions(driver);
		
		for(int i=0;i<link;i++)
		{
			action.moveToElement(list.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			//list.get(i).click();
		}
		
		String parentid = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext())
		{
			String str = it.next();
			if(!str.equalsIgnoreCase(parentid))
			{
				driver.switchTo().window(str);
				System.out.println(driver.getTitle());
			}
				
		}
		
		driver.switchTo().window(parentid);
		js.executeScript("window.scroll(0,0)");
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
