package Pagepkg;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class Checkout_page {
		
		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[5]/a/i")
		WebElement Viewcheckout;
		
		@FindBy(xpath="//*[@id=\"input-payment-firstname\"]")
		WebElement Firstname;
		
		@FindBy(xpath="//*[@id=\"input-payment-lastname\"]")
		WebElement Lastname;
		
		@FindBy(xpath="//*[@id=\"input-payment-company\"]")
		WebElement Company;
		
		@FindBy(xpath="//*[@id=\"input-payment-address-1\"]")
		WebElement Address1;
		
		@FindBy(xpath="//*[@id=\"input-payment-address-2\"]")
		WebElement Address2;
		
		@FindBy(xpath="//*[@id=\"input-payment-city\"]")
		WebElement city;
		
		@FindBy(xpath="//*[@id=\"input-payment-postcode\"]")
		WebElement Postcode;
		
		@FindBy(xpath="//*[@id=\"input-payment-country\"]")
		WebElement country;
		
		@FindBy(xpath="//*[@id=\"input-payment-zone\"]")
		WebElement state;
		
		@FindBy(xpath="//*[@id=\"button-payment-address\"]")
		WebElement Continue1;
		
		@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
		WebElement Continue2;
		
		@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
		WebElement Continue3;
		
		@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
		WebElement Conditions;
		
		@FindBy(xpath="//*[@id=\"button-payment-method\"]")
		WebElement Continue4;
		
		@FindBy(xpath="//*[@id=\"button-confirm\"]")
		WebElement confirmorder;
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
		WebElement Continue5;
		

		
	public Checkout_page(WebDriver driver)
	{
		
		this.driver=driver;
	 PageFactory.initElements(driver,this);
		

	}


	public void checkout() throws InterruptedException 

	{
		
		Viewcheckout.click();
		Continue1.click();
		Continue2.click();
		Continue3.click();
		Conditions.click();
		Continue4.click();
		confirmorder.click();
		Continue5.click();
		
		
		
		
		
		
		
		
		
	}


	}

	


