package selenium.openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHrm {  // Class day 10 time 4:30h

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		

//		String url = "https://opensource-demo.orangehrmlive.com/";
//		driver.get(url);
//		System.out.println(driver.getTitle());
		
       
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		
//		Thread.sleep(1000);
//		driver.close();
		
	}

}
