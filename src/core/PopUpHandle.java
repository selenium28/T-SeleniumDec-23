package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("098765");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		
//		Alert is a interface in Selenium
//		NoAlertPresentException
		Alert art = driver.switchTo().alert();
		art.accept();
		

	}

}
