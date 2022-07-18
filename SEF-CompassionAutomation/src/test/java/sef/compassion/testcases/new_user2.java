package sef.compassion.testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class new_user2 
{
	public class new_user extends BaseClass

	{
		By globalpool 		= By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
		By supporter_type	= By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
		
		@Test
		public void test() throws InterruptedException
		{
			driver.findElement(globalpool).click();
			Thread.sleep(1000);
		
			driver.findElement(supporter_type).click();
			Thread.sleep(1000);
			List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			System.out.println(list1.size());
			list1.get(0).click();
			String value1 = list1.get(0).getText();
			System.out.println(value1);
			Thread.sleep(2000);
			
			
			
	}

	}
}





