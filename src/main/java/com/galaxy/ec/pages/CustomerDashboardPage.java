package com.galaxy.ec.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.galaxy.ec.base.TestBase;

public class CustomerDashboardPage extends TestBase{
	
	
	@FindBy(id="C2__C1__QUE_E7B607645443AA0817199")
	WebElement contactTitle;
	
	@FindBy(css="#C2__C1__QUE_E7B607645443AA0816997")
	WebElement contactFirstName;
	
	@FindBy(id="C2__C1__QUE_E7B607645443AA0817003")
	WebElement contactLastName;
	
	@FindBy(id="C2__C1__QUE_E7B607645443AA0817006")
	WebElement contactDOB;
	
	@FindBy(id="C2__C1__QUE_E7B607645443AA0817009")
	WebElement contactGender;
	
	@FindBy(xpath="//*[@id='C2__C1__p1_HEAD_FA2BC6CB820FCE13781703']/div")
	WebElement contactPostcode;
	
	@FindBy(id="//*[@id='C2__C1__p1_HEAD_FA2BC6CB820FCE13738576']/div")
	WebElement addressLine1;
	
	@FindBy(css="#C2__C1__p1_HEAD_FA2BC6CB820FCE13781709 > div")
	WebElement addressLine4country;
			
	@FindBy(id="C2__C1__QUE_E3C198C90C6E246837146")
	WebElement contactEmail;
	
	// Header Objects
	
	@FindBy(id="C1__Header-NewQuote")
	WebElement newQuoteBtn;
	
	@FindBy(id="C1__Header-Complete")
	WebElement completeBtn;
	
	// New Quote Objects
	
	@FindBy(id="#date-picker-C2__QUE_9AF9ECE9A7A9E74D1066581")
	WebElement startDate;
	
	@FindBy(css="#C2__QUE_9AF9ECE9A7A9E74D1066587")
	WebElement intermediaryList;
	
	@FindBy(css="#C2__QUE_9AF9ECE9A7A9E74D1066590")
	WebElement productList;
	
	@FindBy(css="#C2__QUE_9AF9ECE9A7A9E74D1066593")
	WebElement schemeList;
			
	@FindBy(css="#C2__BUT_9AF9ECE9A7A9E74D1066764")
	WebElement newQuoteFormContinueBtn;
	
	// Data Capture Objects
	
	@FindBy(css="#C2__FS_QUE_15D8DD38C9D9D4FD208240")
	WebElement typeOfCoverRadio;
	
	@FindBy(css="#C2__QUE_F7F54EFB71FFA51524509")
	WebElement noOfBedroomList;
	
	@FindBy(css="#C2__QUE_F7F54EFB71FFA51524560")
	WebElement yearOfBuild;
			
	@FindBy(id="#C2__QUE_F7F54EFB71FFA51524629")
	WebElement typeOfPropertyList;
	
	@FindBy(id="#C2__BUT_15D8DD38C9D9D4FD403269")
	WebElement dataCaptureNextBtn;
	
	
	// Cover/Price Presentation Objects
	
	// Acceptance Objects
	
	
	
	
	
	//initialize PageObjects
	
	public CustomerDashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
