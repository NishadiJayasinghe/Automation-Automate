package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.Base;

public class HomePage extends Base{

public static WebElement  selenium() {
		
		WebElement selenium = getDriver().findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		return selenium;
		
	}
	
	public static WebElement  yahoo() {
		
		WebElement yahoo = getDriver().findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a"));
		return yahoo;
	}
}
