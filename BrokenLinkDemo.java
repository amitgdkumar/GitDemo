import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.testng.asserts.SoftAssert;

public class BrokenLinkDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert softassert = new SoftAssert();
		int totalLink = driver.findElements(By.tagName("a")).size();
		System.out.println("Total Link = "+ totalLink);
		
		/*
		for(int i=0;i<totalLink;i++)
		{
			System.out.println(driver.findElements(By.tagName("a")).get(i).getAttribute("href"));
		}
		*/
		//To click on second item
		//driver.findElements(By.tagName("a")).get(2).click();
		List<WebElement> linkList = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		System.out.println("Total Link in Footer = "+ linkList.size());
		for(WebElement link : linkList)
		{
			String url = link.getAttribute("href");
			//System.out.println(url);
			HttpURLConnection conn= (HttpURLConnection)new URL (url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			//Assert.assertEquals(respCode > 400, false);
			softassert.assertFalse(respCode > 400, "Broken Link = "+respCode+" "+url);
			
		}
		softassert.assertAll();

	}

}
