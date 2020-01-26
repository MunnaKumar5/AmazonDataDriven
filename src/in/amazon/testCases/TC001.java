package in.amazon.testCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import in.amazon.objectRepo.ObjectRepo;
import in.amazon.pageObject.AddToCart;
import in.amazon.pageObject.ClickFirstLink;
import in.amazon.pageObject.DepartmentSearch;
import in.amazon.pageObject.HomePage;
import in.amazon.pageObject.Password;
import in.amazon.pageObject.SearchItem;
import in.amazon.pageObject.SortByFeature;
import in.amazon.pageObject.SortByPrice;
import in.amazon.pageObject.SortByPriceFilling;
import in.amazon.pageObject.UserName;
import in.amazon.utils.Browser;
import in.amazon.utils.Excel;

public class TC001 {
  @Test
  public void login() throws Exception {
	  WebDriver driver = Browser.getBrowser(ObjectRepo.browserName);
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  
	  driver.get(ObjectRepo.url);
	  
	  
	  /*ArrayList<String> list = Excel.getRowData(0);
	  
	  HomePage.SignInClick(driver);
	  UserName.enterUserName(driver,  list.get(0));
	  Password.enterPassword(driver, list.get(1)); */
	  
	  ArrayList<String> list = Excel.getRowData(1);
	  
	  SearchItem.enterSearchItem(driver, list.get(0));
	  
	  DepartmentSearch.enterDepartment(driver, list.get(1));
	  
	  SortByPrice.enterSortByPrice(driver, list.get(3), list.get(4) );
	  //System.out.println(list.get(3)+""+ list.get(4));
	  
	 // SortByPriceFilling.fillPrice(driver, list.get(3), list.get(4));
	  
	  driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	  
	  SortByFeature.selectSortByFeature(driver, list.get(2));
	  
	  ClickFirstLink.selectFirstLink(driver, list.get(5));
	  
	  AddToCart.quantityAddToCart(driver);
	  
      ArrayList<String> list2 = Excel.getRowData(0);
	  
	 // HomePage.SignInClick(driver);
	  UserName.enterUserName(driver,  list2.get(0));
	  Password.enterPassword(driver, list2.get(1));
	  
	  
  }
}
