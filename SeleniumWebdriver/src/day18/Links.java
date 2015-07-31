package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Links extends Launch{
	@Parameters("runlevel")
	@Test
	public void linksTest(String runlevel)
	{
		if(runlevel.equals("Y"))
		 throw new SkipException("hello");
		else
		{
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
		}
	}

}
