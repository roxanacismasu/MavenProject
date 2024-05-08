package curs19;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class SeleniumLocators extends BaseTest {
	
/*cei 8 locatori 
 * tagname
 * linktext
 * partial linktext
 * id
 * class
 * name
 * css selector
 * xpath
 * 
 */
	//relative locators
	/*
	 * toLeftoff
	 * toRightoff
	 * below
	 * above
	 * near
	 */
	
	@Test(priority=1)
	public void tagNameLocator() {
		
		WebElement discoverText = driver.findElement(By.tagName("em"));
		
		 String text = discoverText.getText();//returneaza textul dintre tag-ul html
		 System.out.println(text);
		 assertEquals(text, "Discover");
	}

	@Test(priority = 2)
	public void linkTextLocator() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		driver.getCurrentUrl();//citeste url-ul curent la care se afla browserul
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/");
		
	}
	
	@Test(priority = 3)
	public void partialLinkTextLocator() {
		
		driver.findElement(By.partialLinkText("Healthy")).click();
		
		WebElement booksCategory = driver.findElement(By.linkText("CookBooks"));
		assertTrue(booksCategory.isDisplayed());
	}
	@Test(priority = 4)
	public void classNameLocator() {
		
		
		WebElement price = driver.findElement(By.className("price"));
		System.out.println(price.getText());
		assertTrue(price.getText().contains("18.50");
	}
}
