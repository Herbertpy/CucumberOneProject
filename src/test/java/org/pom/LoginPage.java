package org.pom;

import java.io.IOException;

import org.basecodes.BaseCodes;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseCodes {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// TC01:Login page program

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;

	@FindBy(xpath = "//p[text()='Adactin Launches The Adactin Hotel App! ']")
	private WebElement verify;

	@FindBy(xpath = "//td[text()= 'Welcome to Adactin Group of Hotels']")
	private WebElement verify1;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getVerify1() {
		return verify1;
	}

	public void LoginConfirm() {
		String textMethod = getTextMethod(getVerify());
		//System.out.println(textMethod);
		Assert.assertEquals("Loginpage success", "Adactin Launches The Adactin Hotel App!", textMethod);
	}

	public void LoginAdactin() throws IOException {
		String UserName = getData("Adactin", 1, 0);
		sendKeysTxt(getUsername(), UserName);
		String PassWord = getData("Adactin", 1, 1);
		sendKeysTxt(getPassword(), PassWord);
		click(login);
	}

	public void LoginAdactinWebTap(String username, String password) throws IOException {

		sendKeysTxt(getUsername(), username);

		sendKeysTxt(getPassword(), password);
		click(login);
	}

	public void AfterLoginPage() {

		String textMethod1 = getTextMethod(getVerify1());
		//System.out.println(textMethod1);
		boolean contains = textMethod1.contains("Welcome to Adactin Group of Hotels");
		//System.out.println(contains);
		Assert.assertTrue("Sucessfully loged in", contains);
	}

}
