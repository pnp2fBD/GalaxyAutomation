package com.galaxy.ec.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.galaxy.ec.base.TestBase;
import com.galaxy.ec.pages.HomePage;
import com.galaxy.ec.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpg;
	HomePage homepg;
	
	public HomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void SetUp(){
		initialization();
		loginpg = new LoginPage();
		homepg = loginpg.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTile = homepg.validateHomePageTitle();
		Assert.assertEquals(homePageTile, "AgentDashboard","HomePage Title not matched");
	}

	@AfterMethod()
	public void teardown(){
	//	driver.close();
	//	driver.quit();
	}
		
	
	
}
