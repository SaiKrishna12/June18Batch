import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class YahooLoginusingProperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://yahoomail.com");
		
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\June18Batch\\SeleniumWebdriver\\YahooLogin.properties");
		Properties pr=new Properties();
		pr.load(f);
		driver.findElement(By.id(pr.getProperty("txt_username"))).sendKeys("saikrishna");
		driver.findElement(By.id(pr.getProperty("txt_password"))).sendKeys("pass@123");
		driver.findElement(By.id(pr.getProperty("btn_sigin"))).click();
		
		
		
		
		
	}

}
