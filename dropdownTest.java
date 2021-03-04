import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropDown = new Select(dropdown);
		
		staticDropDown.selectByIndex(5);
		System.out.println(staticDropDown.getFirstSelectedOption().getText());
		
		staticDropDown.selectByVisibleText("BDT");
		System.out.println(staticDropDown.getFirstSelectedOption().getText());
		
		staticDropDown.selectByValue("GBP");
		System.out.println(staticDropDown.getFirstSelectedOption().getText());
		

	}

}
