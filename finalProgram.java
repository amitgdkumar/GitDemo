import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class finalProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		
		driver.findElement(By.className("select_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(@value,'XB')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select dropDown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropDown.selectByIndex(2);
		
		dropDown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		dropDown.selectByVisibleText("1");
		Thread.sleep(2000);
		
		dropDown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropDown.selectByValue("USD");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
