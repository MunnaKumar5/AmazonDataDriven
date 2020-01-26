package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortByPriceFilling {
	
	public static void fillPrice(WebDriver driver, String lowPrice, String highPrice) {
		driver.findElement(By.id("low-price")).sendKeys(lowPrice);
		driver.findElement(By.id("high-price")).sendKeys(highPrice);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		
	}

}
