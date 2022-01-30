package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Solvedge");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hustle");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karate");
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/1993");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0101");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("100");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Josh");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Rctracker@rc.com");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("WWW.google.com");
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("One");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Two");
        driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Add-one");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Add-Two");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("TN");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600091");
        driver.findElement(By.className("smallSubmit")).click();
        
	}
	
}
