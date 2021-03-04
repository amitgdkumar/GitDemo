import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.cssSelector("div[class='picker-first2'] button[class='ui-datepicker-trigger']")).click();
		
		/*while( !driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-datepicker-month']")).getText().contains("April") 
				&& !driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-datepicker-year']")).getText().contains("2022") )
		{
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}*/
		
		while(true)
		{
			if( driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-datepicker-month']")).getText().contains("August") 
					&& driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-datepicker-year']")).getText().contains("2021") )
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
        int count = driver.findElements(By.cssSelector(".ui-state-default")).size();
        for(int i=0; i<count;i++)
        {
        	if( driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText().contentEquals("29") )
        	{
        		driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
        		break;
        	}
        }
        
        driver.findElement(By.cssSelector("div[class='picker-second'] button[class='ui-datepicker-trigger']")).click();
        
        while(!driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-datepicker-month']")).getText().contains("November"))
		{
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
        count = driver.findElements(By.cssSelector(".ui-state-default")).size();
        for(int i=0; i<count;i++)
        {
        	if( driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText().contentEquals("21") )
        	{
        		driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
        		break;
        	}
        }
	}

}
