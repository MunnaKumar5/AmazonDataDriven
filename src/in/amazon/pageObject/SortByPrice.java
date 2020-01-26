package in.amazon.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortByPrice {

	
	public static void enterSortByPrice(WebDriver driver, String lowerPrice, String higherPrice) {
	List<WebElement>	allPrice = driver.findElements(By.xpath("//div[@id='priceRefinements']/ul/li"));
	  //System.out.println(allPrice); 
	//allPrice.get(3).click();	
	
	for (WebElement priceRange : allPrice) {
		
		String value = priceRange.getText();
		
		System.out.println("SortByPrice "+ value);
		
		if((value.contains(lowerPrice)) && ((value.contains(higherPrice)))) {
			
			priceRange.click();
			
		}
		
	}
	
	
	
    
	}
}
