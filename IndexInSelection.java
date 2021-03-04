import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexInSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String[] itemNames = {"Cucumber", "Carrot", "Tomato", "Potato", "Pumpkin"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		addItemsInCart(driver, itemNames);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		
		//Explicit Wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
		
		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
		selectCountry.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}
	
	public static void addItemsInCart(WebDriver driver, String[] itemNames)
	{
		List<WebElement> totalItems = driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println(totalItems.size());
		int count = 0;
		for(int i = 0; i < totalItems.size(); i++)
		{
			String[] name = totalItems.get(i).getText().split("-");
			String actName = name[0].trim();
			List<String> itemNeedToAdd = Arrays.asList(itemNames);
			if(itemNeedToAdd.contains(actName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				count++;
			}
			if (count == itemNames.length )
				break;
		}
	}

}
