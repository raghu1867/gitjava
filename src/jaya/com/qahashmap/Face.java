package jaya.com.qahashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Face {

	static WebDriver driver;

	static HashMap<String, String> logindataface() {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("x", "raghu.jaya05@gmail.com#9912843414");
		hm.put("y", "raghu1867#9912843414");
		return hm;

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String credential_login = logindataface().get("x");
		String str[] = credential_login.split("#");

		driver.findElement(By.id("email")).sendKeys(str[0]);
		driver.findElement(By.id("pass")).sendKeys(str[1]);
		
		WebElement login=driver.findElement(By.name("login"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click();", login);

		// validation

	}

}
