package in.amazon.pageObject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickFirstLink {

	public static void selectFirstLink(WebDriver driver, String quantitySelect) {
	
		
		driver.findElement(By.xpath("//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']/div/div/div/div/div/h2/a/span")).click();
		
		
		Select ele = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		
		ele.selectByVisibleText(quantitySelect);
		
		
		/* String parentWindow = driver.getWindowHandle();
		
				 System.out.println(parentWindow);
				 
		Set<String> allWindow = driver.getWindowHandles();
		
		System.out.println("All Window Id"+allWindow);
		
		for (String window : allWindow) {
			
			if(!window.equals(parentWindow)) {
				
				driver.switchTo().window(window);
				String title = driver.getTitle();
				System.out.println(title);
				
				if(title.contains("HP")) {
					
			Select ele = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			
			ele.selectByVisibleText(quantitySelect);
				
				
					
				}
				
			}
		}*/
				 
		/*String firstLink = driver.getTitle();
		System.out.println("First Link Browser Title: "+firstLink);*/
		
		
		
	
	}
	
}
