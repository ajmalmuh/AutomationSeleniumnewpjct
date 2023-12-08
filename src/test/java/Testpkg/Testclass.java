package Testpkg;



	import java.io.IOException;

	import org.testng.annotations.Test;

	import Basepkg.Baseclass;
	import Pagepkg.Addtocart_page;
	import Pagepkg.Checkout_page;
	import Pagepkg.Login_page;
	import Pagepkg.Logoverification_page;
	import Pagepkg.Registration_page;
	import Pagepkg.Wishlist_page;

	public class Testclass extends Baseclass 
	{
		@Test
		
		public void test() throws InterruptedException, IOException 
		{
			
			Registration_page ob=new Registration_page(driver);
			ob.Registration();
			
			Login_page ob1=new Login_page(driver);
			ob1.Login();
			
			Logoverification_page ob2=new Logoverification_page(driver);
			ob2.Loginvalidation();
			ob2.Logoverification();
			
			Wishlist_page ob3=new Wishlist_page(driver);
			ob3.Wishlist();
			
			Addtocart_page ob4=new Addtocart_page(driver);
			ob4.Addtocarts();
			
			
			Checkout_page ob5=new Checkout_page(driver);
			ob5.checkout();
			
			
				
		}
		
		
}