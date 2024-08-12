package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Clartpage {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"shopify-section-sections--20863479513367__header\"]/div/header/nav/ul/li[2]")
	WebElement charms;
	
	@FindBy (xpath="//*[@id=\"HeaderMenu-MenuList-2\"]/li[4]/a")
	WebElement chains;

	@FindBy (xpath="//*[@id=\"quick-add-template--20863485411607__main-collection-product-grid8949430976791-submit\"]")
	WebElement addtocart;
	
	@FindBy (xpath="//*[@id=\"shopify-section-sections--20863479513367__header\"]/div/header/nav/ul/li[4]/a/span")
	WebElement jhumka;
	
	@FindBy (xpath="//*[@id=\"Slide-template--20863483183383__2680fa35-8343-4f3e-839d-be525a807c7d-3\"]/div/div/div[2]/div/h3/a")
	WebElement Budget;
	
	@FindBy (xpath="//*[@id=\"CardLink-template--20863485411607__main-collection-product-grid-8962497773847\"]")
	WebElement product;
	
	@FindBy (xpath="//*[@id=\"ProductSubmitButton-template--20863483248919__main\"]")
	WebElement product1;
	
	@FindBy (xpath="//*[@id=\"shopify-section-sections--20863479513367__header\"]/div/header/nav/ul/li[1]/a/span")
	WebElement home;
	
	@FindBy (xpath="//*[@id=\"cart-icon-bubble\"]/div")
	WebElement cart;
	
	@FindBy (xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy (xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy (xpath="//*[@id=\"TextField0\"]")
	WebElement fname;
	
	@FindBy (xpath="//*[@id=\"TextField1\"]")
	WebElement lname;
	
	@FindBy (xpath="//*[@id=\"shipping-address1\"]")
	WebElement aname;
	
	@FindBy (xpath="//*[@id=\"TextField3\"]")
	WebElement cname;
	
	@FindBy (xpath="//*[@id=\"TextField4\"]")
	WebElement pincode;
	
	@FindBy (xpath="//*[@id=\"TextField5\"]")
	WebElement phone;
	
	@FindBy (xpath="//*[@id=\"app\"]/div[1]/div/div/div[1]/header/div/div/div/div/header/span[1]/a")
	WebElement clart;
	
	

	public Clartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		public void charmsButton() throws InterruptedException
	{
		charms.click();
		
		Thread.sleep(2000);
		
		chains.click();
	
		  
		}
		
		public void addtocart()
		{
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, 200);");
			addtocart.click();
			
			
		}
		
		public void jhumkaButton()
		{
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,-200);");
			
			jhumka.click();
			

			JavascriptExecutor jv= (JavascriptExecutor) driver;
			jv.executeScript("window.scrollTo(0, 200);");	
			
			Budget.click();
			

		}
		
		public void productButton()
		{
			JavascriptExecutor j= (JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0, 200);");	
			
			product.click();
			
		}
		
		public void addtocart1()
		{
			JavascriptExecutor je= (JavascriptExecutor) driver;
			je.executeScript("window.scrollTo(0, -200);");	
			
			product1.click();
			
			JavascriptExecutor j= (JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0, 200);");
		}
		
		public void homebutton() throws InterruptedException
		{
			
			home.click();
			
			Thread.sleep(3000);
		
			cart.click();
			
			JavascriptExecutor j= (JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0, 200);");
		}
		
		public void checkoutbutton()
		{
			checkout.click();
	
		}
		
		public void Email(String mail)
		{
			email.sendKeys(mail);
		}
		public void address(String f,String l,String a,String c,String p,String ph) throws InterruptedException
		{
			fname.sendKeys(f);
			lname.sendKeys(l);
			
			JavascriptExecutor j= (JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0, 100);");
			
			Thread.sleep(2000);
			
			aname.sendKeys(a);
			cname.sendKeys(c);
			pincode.sendKeys(p);
			phone.sendKeys(ph);
			
			
		}
		
		public void clartstudios()
		{
		clart.click();	
		}
		
		
		

}
