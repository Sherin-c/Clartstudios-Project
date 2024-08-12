package test;


import org.testng.annotations.Test;

import base.Clartbase;
import page.Clartpage;

public class Clarttest extends Clartbase {
	
	
	
	@Test
	public void test() throws InterruptedException
	{
		Clartpage ob=new Clartpage(driver);
		try {
			ob.charmsButton();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		ob.addtocart();
		
		
		ob.jhumkaButton();
		
		ob.productButton();
		
		ob.addtocart1();
		
		ob.homebutton();
		
		ob.checkoutbutton();
		
		ob.Email("arya@gmail.com");
		
		ob.address("Arya","P","A5 Rose garden", "Thrissur","680655", "9546231763");
		
		ob.clartstudios();
	}

}
