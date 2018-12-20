package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class firsttestcase {
	
	private static Select dropdown;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "D:\\eclipse-committers-mars-2-win32-x86_64\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rbhatt");
		

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("free@123");
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame(1);
		WebDriverWait wait = new WebDriverWait(driver, 10);       
	       
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,'Contacts')]"))).click();
		 
	
		 try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	}

	public static Select getDropdown() {
		return dropdown;
	}

	public static void setDropdown(Select dropdown) {
		firsttestcase.dropdown = dropdown;
	}


}



