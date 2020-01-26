package in.amazon.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentSearch {
	
	public static void enterDepartment(WebDriver driver, String department) throws Exception {
		
		if(department.equals("Laptops")) {
		driver.findElement(By.xpath("//span[text()='Laptops']")).click();
		} else {
			
			throw new Exception("No Department Match");
		}
	}
	

}
