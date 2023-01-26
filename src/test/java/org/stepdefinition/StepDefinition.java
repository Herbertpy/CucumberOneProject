package org.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.basecodes.BaseCodes;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.BookHotel;
import org.pom.LoginPage;
import org.pom.SearchHotelPage;
import org.pom.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseCodes {

	public LoginPage login;
	public SearchHotelPage search;
	public SelectHotelPage select;
	public BookHotel book;

	// TC01:Login page Test case
//@Given("User Open the Adactin Aplication In Chrome Browser")
//public void user_Open_the_Adactin_Aplication_In_Chrome_Browser() throws AWTException {
//	driverLaunch("https://adactinhotelapp.com/");
//	maximizeMethod();
//	implicitwait(30);
//	
//    
//}
//
//@Then("User Verify whether the login page is appearedor not")
//public void user_Verify_whether_the_login_page_is_appearedor_not() {
//	login = new LoginPage();
//	login.LoginConfirm();
//}
//
//@When("User give Valid username and password then click on the login button")
//public void user_give_Valid_username_and_password_then_click_on_the_login_button() throws IOException {
//	
//	login.LoginAdactin();
//}
//
//@Then("User verify whether the Search Hotel page is Appeard or Not")
//public void user_verify_whether_the_Select_Hotel_page_is_Appeard_or_Not() throws InterruptedException {
//	
//    login.AfterLoginPage();
//}

// Search hotel codes

//@Given("User Open the Adactin Aplication In Chrome Browser")
//public void user_Open_the_Adactin_Aplication_In_Chrome_Browser() throws AWTException {
//	driverLaunch("https://adactinhotelapp.com/");
//	maximizeMethod();
//	implicitwait(30);
//}
//
//@Then("User Verify whether the login page is appeared or not and pass the information then click on th login button")
//public void user_Verify_whether_the_login_page_is_appeared_or_not_and_pass_the_information_then_click_on_th_login_button() throws IOException {
//	login = new LoginPage();
//	login.LoginAdactin();
//}
//
//@When("User giving valid information in the respective row and then click on the search button")
//public void user_giving_valid_information_in_the_respective_row_and_then_click_on_the_search_button() throws IOException, InterruptedException {
//	search = new SearchHotelPage();
//	search.searchHotel();
//}
//
//@Then("User verify whether the select Hotel page is appear or not")
//public void user_verify_whether_the_select_Hotel_page_is_appear_or_not() {
//	search.selectHotelconfirmation();
//	
//	
//}

	// Select Hotel

@Given("User Open the Adactin Aplication In Chrome Browser")
public void user_Open_the_Adactin_Aplication_In_Chrome_Browser() throws AWTException {
	
}

@Then("User Verify whether the login page is appeared or not and pass the information then click on th login button and fill the hotel details and click on the search button")
public void user_Verify_whether_the_login_page_is_appeared_or_not_and_pass_the_information_then_click_on_th_login_button_and_fill_the_hotel_details_and_click_on_the_search_button() throws IOException, InterruptedException {
	login = new LoginPage();
	login.LoginAdactin();
	search = new SearchHotelPage();
	search.searchHotel();
	
}

@When("User click the select button then click on the search button")
public void user_click_the_select_button_then_click_on_the_search_button() throws IOException {
	select = new SelectHotelPage();
	select.SelectContinuePage();
	book = new BookHotel();
	book.BookHotConId();
}

@Then("User verify whether the Book A Hotel page is appear or not")
public void user_verify_whether_the_Book_A_Hotel_page_is_appear_or_not() {
    book.BookConId();
}

//===================================================================================================

	@When("User give Valid username and password then click on the login button")
	public void user_give_Valid_username_and_password_then_click_on_the_login_button() throws IOException {
		login = new LoginPage();
		login.LoginAdactin();
	}

	@Then("User Verify whether the Search Hotel page is appeared or not")
	public void user_Verify_whether_the_Search_Hotel_page_is_appeared_or_not()
			throws IOException, InterruptedException {
		search = new SearchHotelPage();
		search.searchHotel();

	}

	@When("User give Valid Information in the respective rows then click on the search button")
	public void user_give_Valid_Information_in_the_respective_rows_then_click_on_the_search_button()
			throws IOException, InterruptedException {
		search = new SearchHotelPage();
		search.selectHotelconfirmation();

	}

	@Then("User Verify whether the Select Hotel page is appeared or not")
	public void user_Verify_whether_the_Select_Hotel_page_is_appeared_or_not() {
		select = new SelectHotelPage();
		select.SelectContinuePage();

	}

	@Then("User Select the option given in the page then click on the Continue button")
	public void user_Select_the_option_given_in_the_page_then_click_on_the_Continue_button() {
		select = new SelectHotelPage();
		select.BookAHotelConfirmationPage();
	}

	@Then("User Verify whether the Book A Hotel page is appeared or not")
	public void user_Verify_whether_the_Book_A_Hotel_page_is_appeared_or_not() throws IOException {
		book = new BookHotel();
		book.BookHotConId();

	}

	@When("User give the valid information int respecive box then click the Book Now button")
	public void user_give_the_valid_information_int_respecive_box_then_click_the_Book_Now_button() throws IOException {
		book = new BookHotel();
		book.BookConTxt();
		book.BookConId();
	}
	
//==================================================================================================


@Given("User verifying the login page using assert")
public void user_verifying_the_login_page_using_assert() {
	login = new LoginPage();
	login.LoginConfirm();
	
}

@When("User the give valid username and password using DataTable without header one-D, and click on the login button")
public void user_the_give_valid_username_and_password_using_DataTable_without_header_one_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) throws IOException {
    List<String> asList = dataTable.asList();
    String userName = asList.get(0);
    String passWord = asList.get(1);
    login.LoginAdactinWebTap(userName, passWord);
    System.out.println(userName);
    System.out.println(passWord);
}



//@When("User the give valid username and password using DataTable without header Two-D, and click on the login button")
//public void user_the_give_valid_username_and_password_using_DataTable_without_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) throws IOException {
//    List<List<String>> asLists = dataTable.asLists();
//    String userName = asLists.get(0).get(0);
//    String passWord = asLists.get(1).get(0);
//    login.LoginAdactinWebTap(userName, passWord);
//    System.out.println(userName);
//    System.out.println(passWord);
//}



//@When("User the give valid username and password using DataTable with header one-D, and click on the login button")
//public void user_the_give_valid_username_and_password_using_DataTable_with_header_one_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) throws IOException {
//    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
//    String username = asMap.get("username");
//    String password = asMap.get("password");
//    login.LoginAdactinWebTap(username, password);
//}



//@When("User the give valid username and password using DataTable with header Two-D, and click on the login button")
//public void user_the_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) throws IOException {
//   List<Map<String, String>> asMaps = dataTable.asMaps();
//   String username = asMaps.get(0).get("username");
//   String password = asMaps.get(0).get("password");
//   login.LoginAdactinWebTap(username, password);
//}




//@When("User the give valid {string} and {string} then click on the login button")
//public void user_the_give_valid_and_then_click_on_the_login_button(String userName, String passWord) throws IOException {
//	login.LoginAdactinWebTap(userName, passWord);
//}




@Then("User verify whether the search hotel page is appeard or not")
public void user_verify_whether_the_search_hotel_page_is_appeard_or_not() {
	login.AfterLoginPage();
}


	

}
