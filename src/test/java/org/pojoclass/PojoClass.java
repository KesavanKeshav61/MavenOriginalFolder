package org.pojoclass;

import org.mainbase.com.MainLines;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends MainLines {
	
public PojoClass() {
		
		PageFactory.initElements(driver, this);
		
}
	
	@FindBy(id="email")
	private WebElement emailText;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;

	public WebElement getEmailText() {
		return emailText;
	}


	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	}
	
	

