package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.partialLinkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maheswari");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivalingam");
	        WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
	        Select drop =new Select(tool);
	        drop.selectByVisibleText("Employee");
	        WebElement tool1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	        Select drop1 =new Select(tool1);
	        drop1.selectByIndex(5);
	       // tool.click();
	        WebElement tool2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	        Select drop2 =new Select(tool2);
	        drop2.selectByValue("9001");
	        WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	        Select drop3 =new Select(tool3);
	        drop3.selectByVisibleText("India");
	        driver.findElement(By.name("submitButton")).click();
	        String title1 = driver.getTitle();
	        System.out.println(title1);
	        //driver.close();
			}

	}


