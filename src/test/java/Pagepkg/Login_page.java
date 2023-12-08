package Pagepkg;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login_page {
		
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement MyAccount;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Login;

	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement Email;

	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement pswd;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement Log ;

	   
	       

	       public  Login_page(WebDriver driver)
	       {
	    	   this.driver=driver;
	    	       PageFactory.initElements(driver, this);
	    	          	       
	 
	       }
	       
	       public void Login()
	       {
	    	   MyAccount.click();
	    	   Login.click();
	    	   Email.sendKeys("hgjh@gmail.com");
	    	   pswd.sendKeys("ahbfhg234");
	    	   Log.click();
	       }

	}

