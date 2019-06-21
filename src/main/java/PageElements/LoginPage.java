package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.Base;

public class LoginPage extends Base{
	
public static WebElement email() {
		
		WebElement email = getDriver().findElement(By.xpath("//*[@id=\"email\"]"));
		return email;
	}
	
	public static WebElement password() {
		
		WebElement password = getDriver().findElement(By.xpath("//*[@id=\"password\"]"));
		return password;
	}

	public static WebElement login() {
	
	WebElement login = getDriver().findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input"));
	return login;
	}
}
