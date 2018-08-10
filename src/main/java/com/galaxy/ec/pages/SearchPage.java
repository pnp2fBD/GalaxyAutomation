package com.galaxy.ec.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.galaxy.ec.base.TestBase;

public class SearchPage extends TestBase{

	//Search or Landing Page Objects
	
	@FindBy(xpath="//*[@id='C2__C1__TXT_65369060E37BB4AE5406638']/div/ul/li[1]/a")
	WebElement personalTab;
		
	@FindBy(id="C2__QUE_57179A1244E6618013741")
	WebElement policyNumber;
	
	@FindBy(id="C2__QUE_57179A1244E6618013753")
	WebElement lastName;
	
	@FindBy(id="C2__QUE_57179A1244E6618013759")
	WebElement firstName;
	
	@FindBy(id="C2__BUT_57179A1244E6618013765")
	WebElement searchBtn;
	
	@FindBy(id="C2__BUT_075AC4DA2E63D42D841547")
	WebElement createNewCustomer;
	
	@FindBy(id="C2__BUT_F449F8C15BC15FF9784873")
	WebElement completeBtn;
	
	//CreateContact Objects
	
	@FindBy(id="C2__C1__QUE_B5F37DDFDCE76BB21217316")
	WebElement contactTitleList;
	
	@FindBy(css="#C2__C1__QUE_B5F37DDFDCE76BB21217318")
	WebElement contactFirstName;
	
	@FindBy(id="C2__C1__QUE_B5F37DDFDCE76BB21217322")
	WebElement contactLastName;
	
	@FindBy(xpath="//*[@id='dp1531403974739']/div[1]/span")
	WebElement contactDOB;
	
	@FindBy(id="C2__C1__FS_QUE_B5F37DDFDCE76BB21217328")
	WebElement genderRadio;
	
	@FindBy(id="C2__C1__QUE_B5F37DDFDCE76BB21217362")
	WebElement contactPostcode;
	
	@FindBy(id="C2__C1__BUT_B5F37DDFDCE76BB21217366")
	WebElement findAddressBtn;
	
	@FindBy(xpath="//*[@id='C2__C1__QUE_B5F37DDFDCE76BB21217364']/option[2]")
	WebElement selectAddressDropdown;
	
	@FindBy(id="C2__C1__QUE_B5F37DDFDCE76BB21217390")
	WebElement contactEmail;
	
	@FindBy(id="C2__C1__SaveBtn_Create_New_Personal_Contact")
	WebElement contactSaveBtn;
	
	//initialize the PageObject
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewCustomer(){
		createNewCustomer.click();
		personalTab.click();
		//return new CustomerDashboardPage();
	}
	
	
	
		
}
