package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
//		Absolute Xpath
		WebElement UserName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		UserName.sendKeys("test@test.com");
		
//		Relative Xpath
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("//input[@name='pass']");
		
		WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createNewAccount.click();
		
		WebElement faceBookTitle = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		faceBookTitle.isDisplayed();
		
//		CSS Selector
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();
		
		
		

	}

}
