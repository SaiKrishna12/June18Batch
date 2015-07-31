package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginKeywords {
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://yahoomail.com");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("login-username")).sendKeys("saikrishna");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("login-signin")).click();
	}

}
