import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://citibank.com");
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
