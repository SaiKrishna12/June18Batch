package day12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows1 {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://citibank.com");
	}
	
	@Test
	public void multipleWindowtest()
	{
		driver.findElement(By.xpath("//*[@id='tab1']/div[2]/ul/li/a")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath("html/body/section[1]/article/div/div[3]/div[1]/a[2]/img")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
