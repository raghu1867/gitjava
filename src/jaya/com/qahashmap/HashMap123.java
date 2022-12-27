package jaya.com.qahashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap123 {
	static WebDriver driver;

	static HashMap<String, String> logindata() {

		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("x", "raghu1867#Reddy1867@");
		hs.put("y", "aghu1867#eddy1867@");
		hs.put("z", "reddy18@#raghu67");
		return hs;

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		String login_crediential = logindata().get("y");

		String[] st = login_crediential.split("#");
		driver.findElement(By.name("username")).sendKeys(st[0]);
		driver.findElement(By.name("password")).sendKeys(st[1]);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		if (driver.getTitle().equalsIgnoreCase("CRMPRO")) {
			System.out.println("test is passed");
		} else {
			System.out.println("test fails");
		}

	}

}
