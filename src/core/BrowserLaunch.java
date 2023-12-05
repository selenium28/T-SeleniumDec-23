package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "SeleniumJar/chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver2 = new ChromeDriver();
		
		driver2.get("https://www.facebook.com/login/");
		
		

	}

}
