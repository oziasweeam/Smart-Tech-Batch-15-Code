package smarttech.batch15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenShot {

	public static void main(String[] args) throws Exception{ //Class 13 Day Time is 4:06 H  
		//Class 13 Day Time is 4:14 H
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Class 13 Day Time is 4:25 H
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		WebElement abc = driver.findElement(By.xpath("(//*[contains(text(),'Authentication')])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(abc));
		
		System.out.println(ScreenShot.captureScreenShot(driver, "automationpractice")); // this is the screenshot coming from class


	}

}
