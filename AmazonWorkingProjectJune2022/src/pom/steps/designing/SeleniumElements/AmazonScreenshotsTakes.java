package pom.steps.designing.SeleniumElements;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class AmazonScreenshotsTakes extends SetupConfigFileCode_BaseFile

{
	public static void amazonscreenshot() throws IOException, InterruptedException
	{
		
		 LocalDateTime currenttime =  LocalDateTime.now();
		  String savetime=	currenttime.toString().replace('-', ' ').replace(':', ' ');
	  		
	
		for(int i =1; i<=1;i++)
		{
	  		String screenshot_save_path = "C:\\Users\\yoges\\eclipse-workspace\\AmazonWorkingProjectJune2022\\Screenshots\\" +	savetime	+ i+"  (TestCaseScreenshot).png";
	  		Thread.sleep(5000);
	  		System.out.println(screenshot_save_path);
  		File screencreater = ((TakesScreenshot) amazondriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screencreater, new File(screenshot_save_path));	
		
	}
	
	}

	}
