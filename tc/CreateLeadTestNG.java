package week5.day1.tc;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class CreateLeadTestNG extends ProjectSpecificMethodTestNG {

	@Test
	public void CreateLead() {		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		

	}

}
