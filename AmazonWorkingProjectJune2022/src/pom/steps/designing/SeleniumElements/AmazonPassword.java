package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class AmazonPassword extends SetupConfigFileCode_BaseFile {
	
	
	
	public static void amazonpassword() throws IOException
	{
		String amazonpassword= load_configfile1.getProperty("Password");
		WebElement amazon_password_textbox = amazondriver.findElement(By.xpath("//*[@type='password']"));
		amazon_password_textbox.click();
		amazon_password_textbox.sendKeys(amazonpassword);
		System.out.println(amazon_password_textbox.getText());
	
	}
	
	
	public static void amazonstaysignincheckbox() throws IOException
	{
		
		WebElement amazon_stay_signin_chkbox = amazondriver.findElement(By.xpath("//*[@type='checkbox']"));
		amazon_stay_signin_chkbox.click();		

	}

}
