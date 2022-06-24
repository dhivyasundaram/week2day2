package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapslogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
    WebElement usernameElement = driver. findElement(By.id("username"));
    usernameElement.sendKeys("DemosalesManager");
    
    WebElement passwordElement = driver. findElement(By.name("PASSWORD"));
    passwordElement.sendKeys("crmsfa");
    
    WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
    loginbutton.click();
    
    WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
    crmsfaElement.click();
    
    WebElement elementleads = driver.findElement(By.linkText("Leads"));
    elementleads.click();
    
    WebElement elementcreatelead = driver.findElement(By.linkText("Create Lead"));
    elementcreatelead.click();
    
    WebElement elementcompanyname = driver.findElement(By.id("createLeadForm_companyName"));
    elementcompanyname.sendKeys("TestLeaf");

    WebElement elementfirstname = driver.findElement(By.id("createLeadForm_firstName"));
    elementfirstname. sendKeys("Dhivya");
    
    WebElement elementlastname = driver.findElement(By.id("createLeadForm_lastName"));
    elementlastname. sendKeys("S");
    
    WebElement elementfirstnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
    elementfirstnamelocal.sendKeys("Divi");
    
    WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
    elementDepartment.sendKeys("Bookshop");
    
    WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
    elementDescription.sendKeys("Printing a books");
    
    WebElement elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
    elementemail.sendKeys("dhivya0796@gmail.com");
    
    WebElement elementStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    elementStateDropDown.sendKeys("New York");
    
    WebElement elementcreatebutton = driver.findElement(By.name("submitButton"));
    elementcreatebutton.click();
    
     String title = driver.getTitle();
     System.out.println("The Title is:" +driver.getTitle());
     
   
     
  
    
    
 
 


   
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
