package com.mini_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Hotel {
	static WebDriver driver;
	public static void main(String[] args) {
		WebElement confirm = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]"));
		confirm.click();
		WebElement next = driver.findElement(By.id("continue"));
		next.click();

		
		
	}

}
