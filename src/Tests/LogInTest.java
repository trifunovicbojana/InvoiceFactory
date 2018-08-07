package Tests;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LogIn;

public class LogInTest extends Browser{
	static String url= "http://app.invoice-factory.source-code.rs";
	
	@BeforeMethod
	public static void setBeforeTests() {
	driver.get(url);
	driver.navigate().refresh();
	}
	
	@Test (priority=0)
	public void testVerifyLoginPage() {
		LogIn Login=new LogIn(driver);
		assertTrue(Login.IsOnThePage());
		
	}
	
	@Test(priority=1)
	public void testEmpty() {
	LogIn Login=new LogIn(driver);
	Login.clearEmail();
	Login.clearPassword();
	Login.logIn(); 
	assertTrue(Login.isEmailRequiredDisplayed()&&Login.isPasswordRequiredDisplayed());
	}
	@Test(priority=2)
	public void testIncorrectEmailIncorrectPassword() {
		LogIn Login=new LogIn(driver);
		Login.clearEmail();
		Login.clearPassword();
		Login.fillInputs("trifunovic.bjana@yahoo.com", "dsvg8u");
		Login.logIn();
		assertTrue(Login.isInvalidCreditiansDisplayed());
	
	}
    @Test(priority=3)
    public void testCorrectEmailIncorrectPassword() {
    LogIn Login=new LogIn(driver);
    Login.clearEmail();
	Login.clearPassword();
    Login.fillInputs("trifunovic.bojana@yahoo.com","jdbfhjb");
	Login.logIn();
	assertTrue(Login.isInvalidCreditiansDisplayed());
    
	}
   @Test(priority=4)
    public void testIncorrectEmailEmptyPassword() {
    LogIn Login=new LogIn(driver);
    driver.get(url);
    Login.fillInputs("trifunovic.bojana@yahoo.com","");
	Login.logIn();
	assertTrue(Login.isPasswordRequiredDisplayed()); 
   }
   @Test(priority=5)
   public void testEmptyEmailIncorrectPassword() {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("","jdbfhjb");
	Login.logIn();
	assertTrue(Login.isEmailRequiredDisplayed()); 
   }  
   @Test(priority=6)
   public void testEmptyEmailCorrectPassword() {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("","qwe123");
	Login.logIn();
	assertTrue(Login.isEmailRequiredDisplayed()); 
}
   @Test(priority=7)
   public void testCorrectEmailEmptyPassword () {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("trifunovic.bojana@yahoo.com","");
	Login.logIn();
	assertTrue(Login.isPasswordRequiredDisplayed()); 
}
   @Test(priority=8)
   public void testInvalidEmailCorrectPassword () {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("trifunovic.bojanayahoo.com","q88e123");
	Login.logIn();
	assertTrue(Login.isinvalidEmailDisplayed());  
}
   @Test(priority=9)
   public void testEnterEmailWith2ETandIncorrectPassword() {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("trifunovic.bojana@@yahoo.com","q88e123");
	Login.logIn();
	assertTrue(Login.isinvalidEmailDisplayed()); 

   }  
   @Test(priority=10)
   public void testEnterEmailWith2ETandCorrectPassword() {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("trifunovic.bojana@@yahoo.com","qwe123");
	Login.logIn();
	assertTrue(Login.isinvalidEmailDisplayed());  
}
   @Test(priority=11)
   public void testEnterCorrectEmailAndPasswordWith5Char() {
   LogIn Login=new LogIn(driver);
   driver.get(url);
   Login.fillInputs("trifunovic.bojana@yahoo.com","qe123");
	Login.logIn();
	assertTrue(Login.ispasswordChar6Displayed()); 
}
   @Test(priority=12)
   public void testEnterInvalidEmailAndPasswordWith5Char() {
	   LogIn Login=new LogIn(driver);
	   driver.get(url);
	   Login.fillInputs("trifunovic.bojanahoo.com","qe123");
	   Login.logIn();
	   assertTrue(Login.ispasswordChar6Displayed()&&Login.isinvalidEmailDisplayed()); 
		
}
   @Test(priority=13)
   public void testEnterInvalidEmailAndPasswordWith21Char() {
	   LogIn Login=new LogIn(driver);
	   driver.get(url);
	   Login.fillInputs("trifunovic.bojanahoo.com","qe112312e12e23e2dwedfr4ewdrdrw3e4r3e32e32e223");
	   Login.logIn();
	   assertTrue(Login.ispasswordChar20Displayed()&&Login.isinvalidEmailDisplayed());
}  
   @Test(priority=14)
   public void testEnterCorrectEmailAndPasswordWith21Char() {
	   LogIn Login=new LogIn(driver);
	   driver.get(url);
	   Login.fillInputs("trifunovic.bojana@yahoo.com","qe112312e12e23e2dwedfr4ewdrdrw3e4r3e32e32e223");
	   Login.logIn();
	   assertTrue(Login.ispasswordChar20Displayed());
   }
   @Test(priority=15)
   public void testEnterCorrectEmailAndCorrectPassword() {
	   LogIn Login=new LogIn(driver);
	   driver.get(url);
	   Login.fillInputs("trifunovic.bojana@yahoo.com","qwe123");
	   Login.logIn();
	   assertTrue(Login.LoggedIn());
			   
   
   }
}