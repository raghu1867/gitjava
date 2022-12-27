package jaya.com.qahashmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axes {
	
  public static  WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		String str=driver.findElement(By.xpath("//*[contains(text(),'UCO Bank')]/self::a")).getText();
		System.out.println(str);
		
		
		
		
		
		

	}

}
