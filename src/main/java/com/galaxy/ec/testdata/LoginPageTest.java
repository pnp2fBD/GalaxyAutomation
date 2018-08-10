package com.galaxy.ec.testdata;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.galaxy.ec.base.TestBase;
import com.galaxy.ec.pages.HomePage;
import com.galaxy.ec.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage ;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitletest(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}
	
	@Test(priority=2)
	public void LogoTest(){
		boolean flag  = loginpage.validateMainPageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wdw = new WebDriverWait(driver, 10);
		//WebElement element = wdw.until(Expec)) 
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
		

}
