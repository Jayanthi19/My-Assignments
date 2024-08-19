package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Step1
		ChromeDriver driver = new ChromeDriver();
		//step 2: maximize
      driver.manage().window().maximize();
       //Step3: open the url
      driver.get("https://www.facebook.com/");
 
    
      driver.close();
	}

}
