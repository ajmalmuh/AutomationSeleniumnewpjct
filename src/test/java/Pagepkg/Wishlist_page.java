package Pagepkg;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Wishlist_page
	{
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	WebElement LaptopsandNotebooks;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	WebElement select;

	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")
	WebElement pdct;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i")
	WebElement addtowishlist;

	@FindBy(xpath="//*[@id=\"wishlist-total\"]")
	WebElement viewwishlist;

	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/a")
	WebElement Continue;



	public Wishlist_page(WebDriver driver)
	{
		this.driver=driver;
		     PageFactory.initElements(driver,this);
		
	}
	public void Wishlist() throws InterruptedException

	   {

		
		Actions act=new Actions(driver);
	    act.moveToElement(LaptopsandNotebooks).perform();
	    select.click();
	    
		pdct.click();
		Thread.sleep(2000);
		addtowishlist.click();
		Thread.sleep(2000);
		viewwishlist.click();
		Thread.sleep(2000);
		Continue.click();	
		
	   }




	}


