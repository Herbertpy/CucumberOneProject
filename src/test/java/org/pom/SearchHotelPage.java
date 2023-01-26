package org.pom;

import java.io.IOException;

import org.basecodes.BaseCodes;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseCodes {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// TC02:Search Hotels code
	
		@FindBy(id="location")
		private WebElement location;
		
		@FindBy(id="hotels")
		private WebElement hotels;
		@FindBy(id="room_type")
		private WebElement roomtype;
		@FindBy(id="room_nos")
		private WebElement roomnos;
		
		@FindBy(id="datepick_in")
		private WebElement datepickinerase;
		@FindBy(id="datepick_out")
		private WebElement datepickouterase;
		
		
		@FindBy(id="datepick_in")
		private WebElement datepickin;
		@FindBy(id="datepick_out")
		private WebElement datepickout;
		@FindBy(id="adult_room")
		private WebElement adultroom;
		@FindBy(id="child_room")
		private WebElement childroom;
		@FindBy(id="Submit")
		private WebElement submit;
		@FindBy(xpath = "//td[text()='Select Hotel ']")
		private WebElement confirmation;
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomtype() {
			return roomtype;
		}
		public WebElement getRoomnos() {
			return roomnos;
		}
		
		
		public WebElement getDatepickinerase() {
			return datepickinerase;
		}
		public WebElement getDatepickouterase() {
			return datepickouterase;
		}
		
		
		public WebElement getDatepickin() {
			return datepickin;
		}
		public WebElement getDatepickout() {
			return datepickout;
		}
		public WebElement getAdultroom() {
			return adultroom;
		}
		public WebElement getChildroom() {
			return childroom;
		}
		public WebElement getSubmit() {
			return submit;
		}
		public WebElement getConfirmation() {
			return confirmation;
		}
		
		public void searchHotel() throws IOException, InterruptedException {
			String Location = getData("Adactin", 1, 2);
			sendKeysTxt(getLocation(), Location);
			String Hotels = getData("Adactin", 1, 3);
			sendKeysTxt(getHotels(), Hotels);
			String roomType = getData("Adactin", 1, 4);
			sendKeysTxt(getRoomtype(), roomType);
			String roomNos = getData("Adactin", 1, 5);
			sendKeysTxt(getRoomnos(), roomNos);
			String datePickin = getData("Adactin", 0, 0);
			
			clearMethod(getDatepickinerase());
			Thread.sleep(2500);
			
			sendKeysTxt(getDatepickin(), "08/01/2023");
			String datePickout = getData("Adactin", 0, 0);
			
			clearMethod(getDatepickouterase());
			Thread.sleep(2500);
			
			sendKeysTxt(getDatepickout(), "09/01/2023");
			String adaultRoom = getData("Adactin", 1, 8);
			sendKeysTxt(getAdultroom(), adaultRoom);
			String childRoom = getData("Adactin", 1, 9);
			sendKeysTxt(getChildroom(), childRoom);
			click(submit);  
		}
		
		public void selectHotelconfirmation() {
			String textMethod = getTextMethod(getConfirmation());
			//System.out.println(textMethod);
			boolean contains = textMethod.contains("Select Hotel");
			Assert.assertTrue("next page navigated", contains);
			//System.out.println(contains);	

		}

}
