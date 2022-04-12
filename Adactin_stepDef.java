package com.Step_definition.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Configuration.FileReader;
import com.PageObjectManager.PageObjectManager;
import com.Test_Runner.com.Adactin_Application_Runner;
import com.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_stepDef extends Base {
	public static WebDriver driver = Adactin_Application_Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		url(FileReader.getFile_reader().getConfiguration_reader().getUrl());
		// url("http://adactinhotelapp.com/index.php");
		// driver.get("http://adactinhotelapp.com/index.php");
	}

	@When("^user Enters the Username In The InputBox$")
	public void user_Enters_the_Username_In_The_InputBox() throws Throwable {
		input(pom.getInstanceLogin().getUsername(), "thiyaguRaj");
	}

	@When("^user Enters the Password In The InputBox$")
	public void user_Enters_the_Password_In_The_InputBox() throws Throwable {
		input(pom.getInstanceLogin().getPassword(), "S1DUH4");
	}

	@Then("^user Clicks On The Login Button And Navigates To The SearchHotel$")
	public void user_Clicks_On_The_Login_Button_And_Navigates_To_The_SearchHotel() throws Throwable {
		click(pom.getInstanceLogin().getLogin());
	}

	@When("^user Selects The Location In Dropdown$")
	public void user_Selects_The_Location_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getLocation(), "value", "Paris");
	}

	@When("^user Selects The Hotel In Dropdown$")
	public void user_Selects_The_Hotel_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getHotels(), "index", "2");

	}

	@When("^user Selects The Room Type In Dropdown$")
	public void user_Selects_The_Room_Type_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getRoomtype(), "index", "4");
	}

	@When("^user Selects The Number Of Rooms In Dropdown$")
	public void user_Selects_The_Number_Of_Rooms_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getNo_rooms(), "visibletext", "3 - Three");
	}

	@When("^user Clear The Checkin Date And Enters The Checkin Date In The InputBox$")
	public void user_Clear_The_Checkin_Date_And_Enters_The_Checkin_Date_In_The_InputBox() throws Throwable {
		pom.getInstanceSearchHotel().getCheckin_date().clear();
		input(pom.getInstanceSearchHotel().getCheckin_date(), "08/09/2022");

	}

	@When("^user Clear The Checkout Date And Enters The Checkout Date In The InputBox$")
	public void user_Clear_The_Checkout_Date_And_Enters_The_Checkout_Date_In_The_InputBox() throws Throwable {
		pom.getInstanceSearchHotel().getCheckout().clear();
		input(pom.getInstanceSearchHotel().getCheckout(), "10/09/2022");
	}

	@When("^user Selects The Adult Room In Dropdown$")
	public void user_Selects_The_Adult_Room_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getAdult_rooms(), "value", "2");
	}

	@When("^user Selects The Child Room In Dropdown$")
	public void user_Selects_The_Child_Room_In_Dropdown() throws Throwable {
		dropDown(pom.getInstanceSearchHotel().getChild_rooms(), "value", "1");
	}

	@Then("^user Clicks On Submit Button And Navigates To HotelConfirm Page$")
	public void user_Clicks_On_Submit_Button_And_Navigates_To_HotelConfirm_Page() throws Throwable {
		pom.getInstanceSearchHotel().getSearch().click();

	}

	@When("^user clicks On Checkbox To Confirm The Hotel$")
	public void user_clicks_On_Checkbox_To_Confirm_The_Hotel() throws Throwable {
		pom.getInstanceSelectHotel().getConfirm().click();
	}

	@Then("^user clicks On Continue Button Which Navigates To Booking Details$")
	public void user_clicks_On_Continue_Button_Which_Navigates_To_Booking_Details() throws Throwable {
		pom.getInstanceSelectHotel().getNext().click();
	}

	@When("^user Enters The FirstName In The Inputbox$")
	public void user_Enters_The_FirstName_In_The_Inputbox() throws Throwable {
		input(pom.getInstacneBookHotel().getFirstname(), "Thiyagu");
			}

	@When("^user Enters The LastName In The Inputbox$")
	public void user_Enters_The_LastName_In_The_Inputbox() throws Throwable {
		input(pom.getInstacneBookHotel().getLastname(), "Sathya");
			}
	@When("^user Enters The Address In The Inputbox$")
	public void user_Enters_The_Address_In_The_Inputbox() throws Throwable {
		input(pom.getInstacneBookHotel().getAddress(), "XXXyyyyXX");
	}

	@When("^user Enters The CardNo In The Inputbox$")
	public void user_Enters_The_CardNo_In_The_Inputbox() throws Throwable {
		input(pom.getInstacneBookHotel().getCard_no(), FileReader.getFile_reader().getConfiguration_reader().getCard_no());
	}

	@When("^user Selects The CardType In The Dropdown$")
	public void user_Selects_The_CardType_In_The_Dropdown() throws Throwable {
		dropDown(pom.getInstacneBookHotel().getCard_type(), "index", "3");
		
	}

	@When("^user Selects The ExpiryMonth In The Dropdown$")
	public void user_Selects_The_ExpiryMonth_In_The_Dropdown() throws Throwable {
		dropDown(pom.getInstacneBookHotel().getExpiry_month(), "visibletext", "December");
		
	}

	@When("^user Selects The ExpiryYear In The Dropdown$")
	public void user_Selects_The_ExpiryYear_In_The_Dropdown() throws Throwable {
		dropDown(pom.getInstacneBookHotel().getExpiry_year(), "value", "2022");
	}

	@When("^user Enters The CvvNumber In The InputBox$")
	public void user_Enters_The_CvvNumber_In_The_InputBox() throws Throwable {
		input(pom.getInstacneBookHotel().getCvv(), FileReader.getFile_reader().getConfiguration_reader().getCvv());
	}

	@Then("^user Clicks On The BookNow Button Which Navigates To BookingConfirmation Page$")
	public void user_Clicks_On_The_BookNow_Button_Which_Navigates_To_BookingConfirmation_Page() throws Throwable {
		pom.getInstacneBookHotel().getBook_now().click();
	}
	
	@Then("^user Clicks On The MyItineary Which Navigates to Booked Itinerary page$")
	public void user_Clicks_On_The_MyItineary_Which_Navigates_to_Booked_Itinerary_page() throws Throwable {
		pom.getInstancebookConfirm().getMyItineary().click();
	}

	
	@When("^user Clicks On The OrderID$")
	public void user_Clicks_On_The_OrderID() throws Throwable {
		pom.getInstanceLogout().getBookedItineary().click();
	}

	@Then("^user Clicks On Logout And Gets a Massage Like You have successfully logged out$")
	public void user_Clicks_On_Logout_And_Gets_a_Massage_Like_You_have_successfully_logged_out() throws Throwable {
	    pom.getInstanceLogout().getLogout().click();
	}
	

}
