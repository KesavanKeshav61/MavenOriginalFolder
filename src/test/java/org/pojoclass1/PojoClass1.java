package org.pojoclass1;

import org.mainbase.com.MainLines;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends MainLines{
	
public PojoClass1() {
		
		PageFactory.initElements(driver, this);
		
}

@FindBy(id="firstname")
private WebElement firstName;

@FindBy(id="lastname")
private WebElement lastName;

@FindBy(id="userName")
private WebElement userName;

@FindBy(id="password")
private WebElement passWord;

public WebElement getUserName() {
	return userName;
}
public WebElement getPassWord() {
	return passWord;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}


}


