package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	
	public static void quantityAddToCart(WebDriver driver) {
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		
		
	}

}
