package week5.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends LeafTaps_BaseClass{

@Test
	public  void RunCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("meena");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("p");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("100");
		driver.findElement(By.name("submitButton")).click();
		

}
}