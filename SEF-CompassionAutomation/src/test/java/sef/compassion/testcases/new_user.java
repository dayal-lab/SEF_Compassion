package sef.compassion.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;

public class new_user extends BaseClass

{
	By globalpool 		= By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
	By search_button 	= By.id("global-search");
	By hold_import		= By.xpath("//div[3]/div[1]/div[1]/div[@class='col-lg-12']");
	By appl_code 		= By.xpath("//div[1]/div[1]/div[3]/div[1]/input[@id='barcode']");
	By sponsor_source	= By.xpath("//div[4]/div[1]/div[@class='ui dropdown selection']");
	By supporter_type	= By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
	By RNID				= By.xpath("//input[@id='sprnid0']");
	By search_supprter	= By.xpath("//div[2]/button[@id='fetchsup0']");
	By title			= By.xpath("//div[3]/div[1]//div[@class='ui dropdown selection title']");
	By firstname		= By.xpath("//div[3]/div[2]/div[1]/div[3]/div[2]/div[1]//input[@type='text']");
	By lastname			= By.xpath("//div[3]/div[3]/div[1]//input[@id='surname0']");
	By email			= By.xpath("//div[8]/div[1]/div[1]//input[@id='emailid0']");
	By supporter_group  = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]");
	By DDI_source 		= By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
	By acc_name			= By.xpath("//div[7]/div[2]/div[3]/div[1]/div[1]/input[@id='accountname']");
	By acc_no			= By.xpath("//div[7]/div[2]/div[3]/div[2]/div[1]/input[@id='accountnumber']");
	By sort_code 		= By.xpath("//div[7]/div[2]/div[3]/div[3]/div[1]/input[@id='sortcode']");
	By validate_acc		= By.xpath("//div[5]/div[1]/button[@id='validateBankAccount']");
	By validate_msg		= By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
	By submit			= By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]/input[@id='submit']");
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(globalpool).click();
		Thread.sleep(1000);
		
		driver.findElement(search_button).click();
		Thread.sleep(5000);
		
		driver.findElement(hold_import).click();
		Thread.sleep(5000);
		
		driver.findElement(appl_code).sendKeys("1150");
		
	
		driver.findElement(sponsor_source).click();
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements (By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list.size());
		list.get(1).click();
		String value = list.get(1).getText();
		System.out.println(value);
		Thread.sleep(2000);
		
	
		driver.findElement(supporter_type).click();
		Thread.sleep(1000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list1.size());
		list1.get(0).click();
		String value1 = list1.get(0).getText();
		System.out.println(value1);
		Thread.sleep(2000);
/*		
		driver.findElement(RNID).sendKeys("229207");
		driver.findElement(search_supprter).click();
		Thread.sleep(2000);
		
		
		String parent=driver.getWindowHandle();
		
		Set<String>s=driver.getWindowHandles();

		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				Utilities.hardWait(2);					
			}
		}
		Utilities.hardWait(1);
		driver.findElement(By.xpath("//tr[@id='datatr0']")).click();
		Utilities.hardWait(5);
		
		// It will return the parent window name as a String
		String parent_Window=driver.getWindowHandle();
				
		Set<String>I=driver.getWindowHandles();

		Iterator<String> I2= I.iterator();

		while(I2.hasNext())
		{
		String parent_Window1=I2.next();
		if(!parent_Window.equals(parent_Window1))
			{
				driver.switchTo().window(parent_Window1);
				System.out.println(driver.getTitle());
			}
		}
		Utilities.hardWait(1);
		driver.findElement(By.xpath("//body/div[8]/div[7]/div[1]/button[contains(text(),'OK')]")).click();


*/		
		
		driver.findElement(title).click();
		Thread.sleep(1000);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list2.size());
		list2.get(1).click();
		String value2 = list2.get(1).getText();
		System.out.println(value2);
		Thread.sleep(2000);
		
		driver.findElement(firstname).sendKeys("Peter");
		driver.findElement(lastname).sendKeys("Jenkins");
		Thread.sleep(1000);
		driver.findElement(email).sendKeys("peterjenkins123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(supporter_group).click();
		Thread.sleep(1000);
		List<WebElement> list3 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list3.size());
		list3.get(1).click();
		String value3 = list3.get(1).getText();
		System.out.println(value3);
		Thread.sleep(2000);
		
		driver.findElement(DDI_source).click();
		Thread.sleep(1000);
		List<WebElement> list4 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list4.size());
		list4.get(1).click();
		String value4 = list4.get(1).getText();
		System.out.println(value4);
		Thread.sleep(2000);
		
		driver.findElement(acc_name).sendKeys("David");
		driver.findElement(acc_no).sendKeys("34661743");
		driver.findElement(sort_code).sendKeys("602003");
		driver.findElement(validate_acc).click();
		Thread.sleep(5000);
	
		String actual_msg 	= driver.findElement(validate_msg).getText();
		System.out.println(actual_msg);
		String expected_msg	= "Bank Account Validated Successfully.";
		Assert.assertEquals(actual_msg, expected_msg);
		
		if(!expected_msg.equals(actual_msg))
	 	{
 			System.out.println("Not matched msg");
	 	}
		else
	 	{
 			System.out.println("Matched msg");
	 	 }
		
		
		String month ="August 2022";
		
		driver.findElement(By.xpath("//input[@id='ffdate']")).click();
		
		Thread.sleep(3000);
		
		while(true)
		{
			String msg = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]")).getText();

			if(msg.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}
		}
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		String day = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).getText();
		String msg = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]")).getText();
		System.out.println("Date selected:"+day+" "+msg);
		
		driver.findElement(submit).click();
	
	
	
	}
	}

	
	
	
		
	


