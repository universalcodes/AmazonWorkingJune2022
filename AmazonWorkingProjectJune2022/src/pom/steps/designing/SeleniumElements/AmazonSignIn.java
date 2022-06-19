package pom.steps.designing.SeleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;
public class AmazonSignIn extends SetupConfigFileCode_BaseFile{


		public static void amazonSignInclk()
		
		{

			WebElement loginsuccess = amazondriver.findElement(By.xpath("//*[@type='submit']"));
			loginsuccess.click();
			
			
		}
	}



