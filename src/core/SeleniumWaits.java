package core;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
//		If we trying to find the elements due to application late response, it will throw an exception.
//		1.Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		WebElement homeLink = driver.findElement(By.xpath("//*[text()='Home']"));
//		homeLink.click();
		
//		2. Explicit Wait
		WebElement countryDropDown = driver.findElement(By.name("country"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Register: Mercury Tours"));
		wait.until(ExpectedConditions.visibilityOf(countryDropDown));  // 5 sec visible 
//		wait.until(ExpectedConditions.elementToBeClickable(countryDropDown));
//		wait.until(ExpectedConditions.urlContains("https://demo.guru99.com/test/newtours/reservation.php"));
		
		Select cnt = new Select(countryDropDown);
		cnt.selectByIndex(1);
		
//		3. Fluent Wait - 
//		Fluent wait is used to tell the webdriver to wait for certain conditions as well as the 
//		frequency with which we want to check the condition before throwing an "NoAlertPresentException".
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoAlertPresentException.class);

	}

}
