package com.galaxy.ec.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.galaxy.ec.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	

	
	public static String spinner_css = "body > div.spinning-on-load-bg-table > i";
			
			/*
			/html/body/div[7]/i
			
			body > div.spinning-on-load-bg-table > i
			*/
			
	public void switchtoFrame(String framename){
		driver.switchTo().frame(framename);
	}

	public static void takeScreenshotAtEndOfTest() throws IOException{
		// TODO Auto-generated method stub
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
	}
			
}
