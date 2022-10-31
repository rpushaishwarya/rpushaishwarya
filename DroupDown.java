package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DroupDown {
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
		WebElement createLeadForm_dataSourceId=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(createLeadForm_dataSourceId);
		dd1.selectByVisibleText("Direct Mail");
		WebElement createLeadForm_industryEnumId=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2=new Select(createLeadForm_industryEnumId);
		dd2.selectByValue("IND_SOFTWARE");
		
		WebElement createLeadForm_ownershipEnumId=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3=new Select(createLeadForm_ownershipEnumId);
		dd3.selectByIndex(3);

		
		
		
	}

}
