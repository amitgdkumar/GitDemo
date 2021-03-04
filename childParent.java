import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/");
		driver.findElement(By.xpath("//li[@class='active']/a")).click();
		driver.findElement(By.xpath("//body/app-root/div[1]/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//body/app-root/div[1]/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[4]/following-sibling::li[1]")).click();

	}

}
