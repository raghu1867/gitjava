package jaya.com.qahashmap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingmultcheckbox {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> ls = driver.findElements(By.xpath("//*[@type='checkbox'  and contains(@id,'day')]"));
		/*
		 * int len=ls.size(); 
		 * System.out.println("list of elements :"+len);
		 * 
		 * for(int i=0;i<len;i++) {
		 *  ls.get(i).click(); }
		 */

		/*
		 * for (WebElement we : ls) { String da = we.getAttribute("id"); if
		 * (da.equals("monday") || da.equals("sunday")) { we.click(); } }
		 */
		
		
		  for(WebElement ws:ls) { 
			  
			  String st=ws.getAttribute("id");
		  if(st.equals("monday")||st.equals("sunday")) { 
			  ws.click(); } }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
