package jaya.com.qahashmap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		String month = "02";
		String date = "20";
		String year = "2021";

		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		while (true) {
			String monyears = driver
					.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();

			String arr[] = monyears.split(" ");
			String mon = arr[0];
			String years = arr[1];

			if (mon.equalsIgnoreCase(month) && years.equalsIgnoreCase(years)) {
				break;
			} else
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button"));

		}

		// date selection
		List<WebElement> we = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]"));
		for (WebElement ws : we) {
			String dat = ws.getText();

			if (dat.equalsIgnoreCase(date)) {
				ws.click();
				break;
			}

		}

	}

}
