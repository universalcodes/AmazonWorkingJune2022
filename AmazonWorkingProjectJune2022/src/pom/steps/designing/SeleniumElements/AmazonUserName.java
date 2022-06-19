package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class AmazonUserName extends SetupConfigFileCode_BaseFile {
	
	
	
	public static void amazonusername() throws IOException
	{
		String amazonEmail= load_configfile1.getProperty("AmazonEmail");
		WebElement amazon_useremail_textbox = amazondriver.findElement(By.xpath("//*[@type='email']"));
		amazon_useremail_textbox.click();
		amazon_useremail_textbox.sendKeys(amazonEmail);
		System.out.println(amazon_useremail_textbox.getText());
	
	}
	
	
	public static void amazonctnbutton() throws IOException
	{
		
		WebElement amazon_ctn_btn = amazondriver.findElement(By.xpath("//*[@type='submit']"));
		amazon_ctn_btn.click();		

	}

}
