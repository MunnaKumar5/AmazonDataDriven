package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchItem {
	
	public static void enterSearchItem(WebDriver driver, String searchIteam) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchIteam);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
	}

}
