package selenium.openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		

		
//		String url = "https://opensource-demo.orangehrmlive.com/";
//		driver.get(url);
//		System.out.println(driver.getTitle());
		
        
		driver.findElement(By.name("email")).sendKeys("ozias.weeam");
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(10000);
		driver.findElement(By.name("login")).click();
		
		
		driver.close();

	}

}
