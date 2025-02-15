package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}

	//"@CacheLookup" is an annotation used to instruct the framework to store a found web element 
	//in memory after locating it for the first time, 
	//this will allow for faster access when that element is referenced again in the test, 
	//essentially caching the element to improve performance, 
	//especially when dealing with static elements on a webpage that don't frequently change.
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//*[@id=\"organic-div\"]/form/div[4]/button")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText="Forgot password?")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname){
	txtEmail.clear();
	txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd){
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
	}

	public void clickLogin(){
	btnLogin.click();
	}

	public void clickLogout(){
	lnkLogout.click();
	}







}
