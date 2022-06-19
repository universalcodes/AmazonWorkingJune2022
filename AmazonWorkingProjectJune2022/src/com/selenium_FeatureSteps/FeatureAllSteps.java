package com.selenium_FeatureSteps;

import java.io.IOException;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import pom.steps.designing.SeleniumElements.AmazonScreenshotsTakes;
import pom.steps.designing.SeleniumElements.AmazonSignIn;
import pom.steps.designing.SeleniumElements.AmazonSignout;
import pom.steps.designing.SeleniumElements.AmazonURLDesign;
import pom.steps.designing.SeleniumElements.AmazonPassword;
import pom.steps.designing.SeleniumElements.AmazonUserName;

public class FeatureAllSteps {
	
	
	
	@cucumber.api.java.en.Given("^Open Browser$")
	public static void opened_browser() throws IOException, InterruptedException
	{
		SetupConfigFileCode_BaseFile.amazonbroswersetup();

	}

	
	@cucumber.api.java.en.And("^Enter the Valid URL$")
	public static void url_entered() throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);

		AmazonURLDesign.amazonurlSetup();


	}

	@cucumber.api.java.en.And("^Users Takes the Screenshot$")
	public static void amazonSSTaken_Saved() throws IOException, InterruptedException
	{
		AmazonScreenshotsTakes.amazonscreenshot();
		Thread.sleep(5000);


	}

	@cucumber.api.java.en.When("^Enter the Valid Email ID$")
	public static void urldentered() throws IOException, InterruptedException
	{
		AmazonUserName.amazonusername();
		Thread.sleep(5000);


	}
	

	@cucumber.api.java.en.And("^User Clicks on Continue Button$")
	public static void amzonctn_clk() throws IOException, InterruptedException
	{
		AmazonUserName.amazonctnbutton();
		Thread.sleep(5000);


	}
	 

	@cucumber.api.java.en.And("^Enter the Valid Password$")
	public static void password_entered() throws IOException,InterruptedException
	{
		AmazonPassword.amazonpassword();
		Thread.sleep(5000);


	}
	

	@cucumber.api.java.en.And("^Click on Stay Sign in Button$")
	public static void stay_sign_clk() throws IOException, InterruptedException
	{
		AmazonPassword.amazonstaysignincheckbox();
		Thread.sleep(5000);


	}
	

	@cucumber.api.java.en.And("^Click on Login Button$")
	public static void amazon_login_clk() throws IOException, InterruptedException
	{
		AmazonSignIn.amazonSignInclk();
		Thread.sleep(5000);


	}
	@cucumber.api.java.en.And("^User Clicked on SignOut Button$")
	public static void signout_clk() throws IOException, InterruptedException
	{
		AmazonSignout.amazonTextHover();
		Thread.sleep(5000);
		AmazonSignout.amazonTextclk();



	}
 

	@cucumber.api.java.en.Then("^Amazon Browser is Closed$")
	public static void opened_browser_closed() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		SetupConfigFileCode_BaseFile.closeamazonDriver();
		

	}
	
	

}
