package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)throws InterruptedException {
		//Initialize the web driver
		ChromeDriver driver = new ChromeDriver();
		//Loaded the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click Login
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(3000);
        //Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();
        Thread.sleep(3000);
        //click Leads tab
        driver.findElement(By.linkText("Leads" )).click();
        //Click create leads
        driver.findElement(By.linkText("Create Lead" )).click();
        Thread.sleep(3000);
        //Enter company name, FN, LN, Title
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TVS");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayanthi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vengatesan");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test");
        //Click Create lead button
        driver.findElement(By.name("submitButton")).click();
        
        Thread.sleep(3000);
        
        //get title page
        String title = driver.getTitle();
        if(title.contains("View Lead")) {
        	System.out.println("Lead created successfull");
        }else {
        	System.out.println("Lead is not created");
        }
        //Close the browser
        driver.close();
        
        
		

	}

}
	
