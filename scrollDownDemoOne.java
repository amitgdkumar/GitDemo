import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDownDemoOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize(); //To maximize the window
		//driver.manage().deleteAllCookies();  //To delete all cookies
		//if you delete cookie named sessionKey then after that if you will click on
		//any link then session will logout and it will ask for login again.
		//driver.manage().deleteCookieNamed("sessionKey");
		//To add cookies if you know cookies name but this API is used rarely.
		//driver.manage().addCookie(fest);
		
		
		//To scroll down windows we use JavascriptExecutor class.
		JavascriptExecutor jExecutor = (JavascriptExecutor)driver;
		jExecutor.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		//To scroll any table exist inside webpage.
		jExecutor.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		//jExecutor.executeScript("document.querySelector('.tableFixHead').scrollLeft=500");
		
		int countRows = driver.findElements(By.xpath("//div[@class='left-align'] //tr")).size();
		//int countRows = driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table")).findElements(By.tagName("tr")).size();
		System.out.println(countRows);
		
		int countColumn = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1] //th")).size();
		//int countColumn = driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table")).findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(countColumn);
		
		for(int i=0; i<driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td")).size(); i++)
		{
			System.out.println(driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td")).get(i).getText());
		}
		
		int totalItems = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).size();
		System.out.println(totalItems);
		int sum = 0;
		for(int i=0;i<totalItems;i++) 
		{
			sum+= Integer.parseInt(driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).get(i).getText());
		}
		System.out.println(sum);
		//driver.quit(); //close all tabs
		//driver.close();//close current tab
	}

}
