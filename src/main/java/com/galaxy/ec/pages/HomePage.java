package com.galaxy.ec.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.galaxy.ec.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//*[@id='C1__ITM_5866E32A0412B1F918363']/a")
	WebElement loginuserLabel;			

	@FindBy(xpath = "//*[@id='C1__HEAD_278ED1FB8B58FA001615557']")
	WebElement myDashboard;	
	
	@FindBy(xpath = "//*[@id='C2__BUT_8A211A5516D895E938601']/span/span")
	WebElement takeCall;
	
	@FindBy(xpath = "//*[@id='C2__BUT_8A211A5516D895E944140']/span/span")
	WebElement makeCall;
	
	@FindBy(xpath = "//*[@id='C2__BUT_8A211A5516D895E944146']/span/span")
	WebElement adminTask;
	
	@FindBy(xpath = "//img[contains(@alt,'Head Office')]")
	WebElement headofficeBranch;
	
	@FindBy(xpath = "//img[contains(@alt,'Aldershot Branch')]")
	WebElement aldershotBranch;
	
	//Initialize the pageobject
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateHomePageTitle(){
			return driver.getTitle();
	}
	
	public SearchPage takecall(){
		takeCall.click();
		headofficeBranch.click();
		return new SearchPage();
	}
	
	public SearchPage makecall(){
		makeCall.click();
		aldershotBranch.click();
		return new SearchPage();
	}
	
	
}
