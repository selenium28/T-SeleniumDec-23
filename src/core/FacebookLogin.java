package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys("test@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("password");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.tagName("a"));
		driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
		

	}

}
