package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHRM.library.LoginPage;
import utills.AppUtills;



public class AdminLoginWithValidData extends AppUtills{

	@Parameters({"userid","password"})
	@Test
	public void CheckAdminLogin(String uid,String Pwd) throws InterruptedException {
		
		System.out.println(uid+" "+Pwd);
		
		LoginPage logpage=new LoginPage();
		logpage.login(uid, Pwd);
		Assert.assertTrue(logpage.isAdminModuleDisplayed());
		logpage.lgout();
		
		
	}
}
