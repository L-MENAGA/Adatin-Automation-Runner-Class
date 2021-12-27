package com.Runner1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dec_Mini_Project.Base_Class;
import com.Dec_Mini_Project.Home_Page;

public class Test_Runner extends Base_Class{
	
	public static void main(String[] args)  throws Throwable {
		driver=getBrowser("chrome");
		url("http://automationpractice.com/index.php");
		sleep(2000);
		WebElement login=driver.findElement(By.className("login"));
		clickIt(login);
		WebElement email = driver.findElement(By.id("email"));
		inputValueElement(email, "geetha7096@gmail.cim");
		sleep(1000);
		WebElement password = driver.findElement(By.id("passwd"));
		inputValueElement(password, "Automationpractice@22");
		WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
		clickIt(submitLogin);
		sleep(2000);
		WebElement t_Shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		actionsClass("moveTO", t_Shirt);
		actionsClass("clickOn", t_Shirt);
		sleep(4000);
		WebElement img_tshirt = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		clickIt(img_tshirt);
		sleep(30000);
		//frameoperations("frameByIndex", null,0, null);
		driver.switchTo().frame(0);
	    WebElement submit = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickIt(submit);
		WebDriverWait wait= new WebDriverWait(driver,150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
		WebElement proceedToCart = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		actionsClass("moveTo",proceedToCart);
		actionsClass("clickOn",proceedToCart);
		//   driver.findElement(By.id("order")).click();
	    WebElement proceedToCart2= driver.findElement(By.xpath(("//*[@id=\"center_column\"]/p[2]/a[1]/span")));
	    actionsClass("moveTo",proceedToCart2);
		actionsClass("clickOn",proceedToCart2);
	    sleep(1000);
	    WebElement proceedToCart3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	    clickIt(proceedToCart3);
		sleep(1000);
		WebElement checkBox = driver.findElement(By.id("cgv"));
		clickIt(checkBox);
		sleep(2000);
		WebElement procedToCart4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		clickIt(procedToCart4);
		sleep(1000);
		WebElement chque = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickIt(chque);
		sleep(2000);
		WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		clickIt(confirmOrder);
		sleep(3000);
		WebElement Scroll = driver.findElement(By.xpath("(//h1[@class='page-heading'])"));
		scrollUp_Down(Scroll);
		sleep(8000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic6.png");
		 org.openqa.selenium.io.FileHandler.copy(source, destination);
	}

}