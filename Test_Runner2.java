package com.Runner1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dec_Mini_Project.AddToCartF_Page;
import com.Dec_Mini_Project.Base_Class;
import com.Dec_Mini_Project.ConfirmOrder_Page;
import com.Dec_Mini_Project.Home_Page;
import com.Dec_Mini_Project.Img_Category;
import com.Dec_Mini_Project.Last_Page;
import com.Dec_Mini_Project.Login_Page;
import com.Dec_Mini_Project.MyAccount_Page;
import com.Dec_Mini_Project.Payment_Page;
import com.Dec_Mini_Project.ProceedToCart2_Page;
import com.Dec_Mini_Project.ProceedToCart3_Page;
import com.Dec_Mini_Project.ProceedToCart4_Page;
import com.Dec_Mini_Project.ProceedToCart_Page;
import com.Dec_Mini_Project.Screenshot;

public class Test_Runner2 extends Base_Class{
	
public static WebDriver	driver = getBrowser("chrome");
public static  Home_Page hp= new Home_Page(driver);
public static Login_Page login= new Login_Page(driver);
public static MyAccount_Page tshirts = new MyAccount_Page(driver);
public static Img_Category img = new Img_Category(driver);
public static AddToCartF_Page cart1= new AddToCartF_Page(driver);
public static ProceedToCart_Page proceedCart1 =new ProceedToCart_Page(driver);
public static ProceedToCart2_Page  cart2 = new ProceedToCart2_Page(driver);
public static ProceedToCart3_Page cart3=new ProceedToCart3_Page(driver);
public static ProceedToCart4_Page cart4= new ProceedToCart4_Page(driver);
public static Payment_Page checque= new Payment_Page(driver);
public static ConfirmOrder_Page confirmation=new ConfirmOrder_Page(driver);
public static Last_Page scroll =new Last_Page(driver);
public static void main(String[] args)  throws Throwable {
		url("http://automationpractice.com/index.php");
		sleep(2000);
		clickIt(hp.getsignin_page());
		inputValueElement(login.getEmail(), "geetha7096@gmail.cim");
		sleep(1000);
		inputValueElement(login.getPassword(), "Automationpractice@22");
		clickIt(login.getSubmitLogin());
		sleep(2000);
		actionsClass("moveTO", tshirts.getT_Shirt());
		actionsClass("clickOn", tshirts.getT_Shirt());
		sleep(4000);
		clickIt(img.getImg_Tshirt());
		sleep(30000);
		driver.switchTo().frame(0);
		clickIt(cart1.getaddToCart_1());
		explicitwait(175, proceedCart1.getProceedToCart1());
		actionsClass("moveTo",proceedCart1.getProceedToCart1());
		actionsClass("clickOn",proceedCart1.getProceedToCart1());
		//   driver.findElement(By.id("order")).click();
		actionsClass("moveTo",cart2.getProceedToCart_2());
	    actionsClass("clickOn",cart2.getProceedToCart_2());
	    sleep(1000);
	    clickIt(cart3.getProceedToCart3());
		sleep(1000);
		clickIt(cart4.getCheckBox());
		sleep(2000);
		clickIt(cart4.getProceedToCart4());
		sleep(1000);
		clickIt(checque.getCheque());
		sleep(2000);
		clickIt(confirmation.getConfirmOrder());
		sleep(3000);
		scrollUp_Down(scroll.getLastPage());
		sleep(8000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic7.png");
		 org.openqa.selenium.io.FileHandler.copy(source, destination);
	}

}