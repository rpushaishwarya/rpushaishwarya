package week2.day2;

import javax.swing.text.html.parser.TagElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Aspire");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("usha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RP");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ishwarya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AutomationTester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("SalaryIncrement");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rpushaishwarya@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Promoted as a senior automation tester");
		driver.findElement(By.className("smallSubmit")).click();
		String text=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);





		

		


	
	}

}
