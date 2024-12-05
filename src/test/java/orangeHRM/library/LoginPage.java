package orangeHRM.library;

import org.openqa.selenium.By;

import utills.AppUtills;

public class LoginPage extends AppUtills {

	
	public void login(String uid,String Pwd) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();;	
	}
	
	public boolean isAdminModuleDisplayed() {
		if(driver.findElement(By.linkText("Admin")).isDisplayed()){
			return true;
		}else {
			return false;
		}
	}
	
		
	public void lgout() {
		driver.findElement(By.id("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
