package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import chrome.WebPagePOM;

public class Gmail {
	//public static void main(String[] args){
	@Test
	public void validLogin(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        	WebPagePOM login = new WebPagePOM();
        	login.typeUsername();
        	login.clickNext();
        	login.typePassword();
        	login.clickSubmit();
        	driver.close();
	}

}
