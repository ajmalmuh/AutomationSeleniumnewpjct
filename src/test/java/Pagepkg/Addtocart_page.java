package Pagepkg;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.interactions.Actions;

	public class Addtocart_page {
		
		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
		WebElement LaptopsandNotebooks;
		
		@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
		WebElement select;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")
		WebElement pdct;
		
		@FindBy(xpath="//*[@id=\"button-cart\"]")
		WebElement addcart;
		
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/i")
	    WebElement viewcart;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/a")
	    WebElement Continueshopping;
		
		
		
	public Addtocart_page(WebDriver driver)


	   {
		this.driver=driver;
		     PageFactory.initElements( driver, this);
	   }


	public void Addtocarts() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
	    act.moveToElement(LaptopsandNotebooks).perform();
	    select.click();
	    
	    pdct.click();
		Thread.sleep(2000);
		addcart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(2000);
		Continueshopping.click();
		
	}


	}



