package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.expedia.co.in");
		driver.findElement(By.id("hotel-1-children")).sendKeys("6");
		driver.findElement(By.id("hotel-destination")).click();
		WebElement block=driver.findElement(By.id("hotel-1-children-ages"));
		List<WebElement> dropdowns=block.findElements(By.tagName("select"));
		System.out.println(dropdowns.size());
	}

}
