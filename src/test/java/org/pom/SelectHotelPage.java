package org.pom;

import org.basecodes.BaseCodes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseCodes{
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continueBtn;      
	
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement thirdPageConfirmation;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getThirdPageConfirmation() {
		return thirdPageConfirmation;
	}
	
	public void SelectContinuePage() {
		click(getRadiobutton());
		click(getContinueBtn());

	}
	
	public void BookAHotelConfirmationPage() {
		String textMethod = getTextMethod(getThirdPageConfirmation());
		System.out.println(textMethod);

	}
	

}
