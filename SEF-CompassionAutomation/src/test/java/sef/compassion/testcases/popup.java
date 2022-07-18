package sef.compassion.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;

public class popup extends BaseClass
{
	By globalpool 		= By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
	By search_button 	= By.id("global-search");
	By hold_import		= By.xpath("//div[3]/div[1]/div[1]/div[@class='col-lg-12']");
	By sponsor_source	= By.xpath("//div[4]/div[1]/div[@class='ui dropdown selection']");
	By supporter_type	= By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
	By RNID				= By.xpath("//input[@id='sprnid0']");
	By search_supprter	= By.xpath("//div[2]/button[@id='fetchsup0']");
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(globalpool).click();
		Thread.sleep(1000);
		
		driver.findElement(search_button).click();
		Thread.sleep(5000);
		
		driver.findElement(hold_import).click();
		Thread.sleep(5000);
		
		driver.findElement(supporter_type).click();
		Thread.sleep(1000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list1.size());
		list1.get(0).click();
		String value1 = list1.get(0).getText();
		System.out.println(value1);
		Thread.sleep(2000);
		
		driver.findElement(RNID).sendKeys("229207");
		driver.findElement(search_supprter).click();
		Thread.sleep(2000);
		
			// It will return the parent window name as a String
				String parent=driver.getWindowHandle();
				
				Set<String>s=driver.getWindowHandles();

				// Now iterate using Iterator
				Iterator<String> I1= s.iterator();

				while(I1.hasNext())
				{
				String child_window=I1.next();
				if(!parent.equals(child_window))
					{
						driver.switchTo().window(child_window);
						Utilities.hardWait(2);					
					}
				}
				Utilities.hardWait(1);
				driver.findElement(By.xpath("//tr[@id='datatr0']")).click();
				Utilities.hardWait(7);
				
						// It will return the parent window name as a String
						String parent_Window=driver.getWindowHandle();
						
						Set<String>I=driver.getWindowHandles();

						// Now iterate using Iterator
						Iterator<String> I2= I.iterator();

						while(I2.hasNext())
						{
						String parent_Window1=I2.next();
						if(!parent_Window.equals(parent_Window1))
							{
								driver.switchTo().window(parent_Window1);
								String msg = driver.findElement(By.xpath("//body/div[8]/p[1]")).getText();
								System.out.println(msg);
							}
						}
				Utilities.hardWait(1);
				driver.findElement(By.xpath("//body/div[8]/div[7]/div[1]/button[contains(text(),'OK')]")).click();
		

		
		
	}	

}
