package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortByFeature {
	
	public static void selectSortByFeature(WebDriver driver, String sortByFeature) {
	Select ele = new Select(driver.findElement(By.id("s-result-sort-select")));
	
	ele.selectByVisibleText(sortByFeature);
		
		
		
	}

}
