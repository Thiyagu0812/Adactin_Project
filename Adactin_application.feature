Feature: Adactin Hotel Booking Application 
Scenario: Login Functionality 
Given user Launch The Application
When user Enters the Username In The InputBox
And user Enters the Password In The InputBox
Then user Clicks On The Login Button And Navigates To The SearchHotel

Scenario: Search Hotel
When user Selects The Location In Dropdown
And user Selects The Hotel In Dropdown
And user Selects The Room Type In Dropdown
And user Selects The Number Of Rooms In Dropdown
And user Clear The Checkin Date And Enters The Checkin Date In The InputBox
And user Clear The Checkout Date And Enters The Checkout Date In The InputBox
And user Selects The Adult Room In Dropdown
And user Selects The Child Room In Dropdown
Then user Clicks On Submit Button And Navigates To HotelConfirm Page

Scenario: Hotel Confirm 
When user clicks On Checkbox To Confirm The Hotel
Then user clicks On Continue Button Which Navigates To Booking Details

Scenario: Booking Hotel
When user Enters The FirstName In The Inputbox
And user Enters The LastName In The Inputbox
And user Enters The Address In The Inputbox
And user Enters The CardNo In The Inputbox
And user Selects The CardType In The Dropdown
And user Selects The ExpiryMonth In The Dropdown
And user Selects The ExpiryYear In The Dropdown
And user Enters The CvvNumber In The InputBox
Then user Clicks On The BookNow Button Which Navigates To BookingConfirmation Page

Scenario: Booking Confirmation
Then user Clicks On The MyItineary Which Navigates to Booked Itinerary page

Scenario: Booked Itinerary
When user Clicks On The OrderID
Then user Clicks On Logout And Gets a Massage Like You have successfully logged out


