package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public static void SignInClick(WebDriver driver) {
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	}

}
