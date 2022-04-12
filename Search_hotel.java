package com.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search_hotel {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select s= new Select(location);
		s.selectByIndex(6);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1= new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement room_type = driver.findElement(By.id("room_type"));
		Select s2= new Select(room_type);
		s2.selectByValue("Super Deluxe");
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		Select s3= new Select(room_nos);
		s3.selectByIndex(4);
		WebElement checkin_date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkin_date.clear();
		checkin_date.sendKeys("04/04/2022");
		WebElement checkout_date = driver.findElement(By.id("datepick_out"));
		checkout_date.clear();
		checkout_date.sendKeys("05/06/2022");
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult_room);
		s4.selectByValue("4");
		WebElement child_room = driver.findElement(By.id("child_room"));
		Select s5=new Select(child_room);
		s5.selectByVisibleText("2 - Two");
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();

		
		
	}

}
