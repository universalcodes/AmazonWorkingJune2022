package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class AmazonURLDesign extends SetupConfigFileCode_BaseFile {
	
	static String urlvalue= load_configfile1.getProperty("URL");

	public static void amazonurlSetup() throws IOException
	{
		amazondriver.get(urlvalue);
		amazondriver.manage().window().maximize();
		
	}
	
	
	


}
