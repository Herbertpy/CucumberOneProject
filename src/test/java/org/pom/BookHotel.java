package org.pom;

import java.io.IOException;

import org.basecodes.BaseCodes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseCodes  {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement BookingConfirmation;
	@FindBy(id="order_no")
	private WebElement orderno;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getBookingConfirmation() {
		return BookingConfirmation;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	
	public void BookHotConId() throws IOException {
		String firstName = getData("Adactin", 4, 0);
		sendKeysTxt(getFirstname(), firstName);
		String lastName = getData("Adactin", 4, 1);
		sendKeysTxt(getLastname(), lastName);
		String address = getData("Adactin", 4, 2);
		sendKeysTxt(getAddress(), address);
		String ccnum = getData("Adactin", 0, 0);
		sendKeysTxt(getCcnum(), "1234567897894561");
		String cctype = getData("Adactin", 4, 4);
		sendKeysTxt(getCctype(), cctype);
		String ccexpmonth = getData("Adactin", 4, 5);
		sendKeysTxt(getCcexpmonth(), ccexpmonth);
		String ccexpyear = getData("Adactin", 0, 0);
		sendKeysTxt(getCcexpyear(), "2020");
		String cccvv = getData("Adactin", 0, 0);
		sendKeysTxt(getCccvv(), "459");
		click(getBooknow());
		
	}
	
	public void BookConTxt() {
		String textMethod1 = getTextMethod(getBookingConfirmation());
		System.out.println(textMethod1);
		

	}
	public void BookConId() {
		String attributeValue = getAttributeValue(getOrderno(), "value");
		System.out.println(attributeValue);

	}
	
}
