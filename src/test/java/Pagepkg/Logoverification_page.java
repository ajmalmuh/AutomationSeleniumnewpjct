package Pagepkg;



	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	public class Logoverification_page {
		

		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"logo\"]/a/img")
		WebElement Logo;
		
		
		  public Logoverification_page(WebDriver driver)
		  
		  {
			  
		this.driver=driver;
		     PageFactory.initElements(driver,this);
		     
		  }

		  public void Loginvalidation()
		  {
			  String exp="https://naveenautomationlabs.com/opencart/index.php?route=account/account";
			  String actual=driver.getCurrentUrl();
			  Assert.assertEquals(actual,exp);
			  System.out.println("\n Login validation passed");  
			  
		  }
		  
		  public void Logoverification() throws IOException
		  {
			  boolean logo=Logo.isDisplayed();
			  if(logo)
			  {
				  System.out.println("\n Logo is displayed");
				  System.out.println();
			  }
			  else
			  {
				  System.out.println("\n Logo is not displayed");
				  System.out.println();
			  }
			  
			  File scr=Logo.getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(scr, new File("C:\\Users\\USER\\Desktop\\selenium.png"));
		  }
		
	}

