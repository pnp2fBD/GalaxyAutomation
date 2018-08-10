package com.galaxy.ec.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.galaxy.ec.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - OR
	
	@FindBy(xpath = "//*[@id='C2__QUE_ED508ADA5C44080859323']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id='C2__QUE_ED508ADA5C44080859331']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='C2__BUT_ED508ADA5C44080859357']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id='C2__row_TXT_19B044C4A657962C224000']")
	WebElement sspLogo;
	
	//Initializing the PageObjects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateMainPageLogo(){
		return sspLogo.isDisplayed();
	}
	
	public HomePage login(String uname, String passwd){
		
		username.sendKeys(uname);
		
		password.sendKeys(passwd);
		
		loginBtn.click();
	    
	    return new HomePage();
	}
}
