package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Result {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\cmr\\Desktop\\22r01a6710\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://cmritautonomous.org/BeesERP/Login.aspx?ReturnUrl=%2Fbeeserp%2FLogin");
	WebElement usname =d.findElement(By.name("txtUserName"));
	usname.sendKeys("20R01A05K6P");
	Thread.sleep(1000);
	WebElement nxtBtn=d.findElement(By.name("btnNext"));
	nxtBtn.click();
	WebElement pass=d.findElement(By.name("txtPassword"));
	pass.sendKeys("20R01A05K6P");
	WebElement submit=d.findElement(By.name("btnSubmit"));
	submit.click();
}
}
