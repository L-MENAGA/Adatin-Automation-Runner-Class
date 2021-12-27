package com.Runner1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Dec_Mini_Project.Base_Class;
import com.Dec_Mini_Project.PageObjectManager;

import propety_File.file_Reader_Manager;

public class Test_Runner5 extends Base_Class{
	public static WebDriver driver =getBrowser("chrome");
	public static PageObjectManager pom =new PageObjectManager(driver);
	public static Logger log =Logger.getLogger(Test_Runner3.class);
	
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
	//url("http://automationpractice.com/index.php");
	String url =file_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	url(url);
	sleep(3000);
	log.info("Launched Browser Successfully");
	clickIt(pom.getInstancehp().getsignin_page());
	//String email = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Automation Practice.xlsx", 2,5 );
	String email =file_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
	inputValueElement(pom.getInstancelogin().getEmail(), email);
	sleep(1000);
	//String password = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Automation Practice.xlsx", 3,5);
	String password =file_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
	System.out.println(password);
	inputValueElement(pom.getInstancelogin().getPassword(), password);
	
	clickIt(pom.getInstancelogin().getSubmitLogin());
	sleep(2000);
	log.warn("Logged In successfully");
	actionsClass("moveTO", pom.getInstancetshirts().getT_Shirt());
	actionsClass("clickOn", pom.getInstancetshirts().getT_Shirt());
	sleep(4000);
	clickIt(pom.getInstancetimg().getImg_Tshirt());
	log.info(" Image Clicked successfully");
	sleep(30000);
	frameoperations("frameByIndex", "0", null);
	//driver.switchTo().frame(0);
	clickIt(pom.getInstancetcart1().getaddToCart_1());
	explicitwait(175, pom.getInstanceproceedCart1().getProceedToCart1());
	actionsClass("moveTo",pom.getInstanceproceedCart1().getProceedToCart1());
	actionsClass("clickOn",pom.getInstanceproceedCart1().getProceedToCart1());
	// driver.findElement(By.id("order")).click();
	
	actionsClass("moveTo",pom.getInstancecart2().getProceedToCart_2());
    actionsClass("clickOn",pom.getInstancecart2().getProceedToCart_2());
    log.debug(" Product Added to Cart Successfully");
    sleep(1000);
    clickIt(pom.getInstancetproceedcart3().getProceedToCart3());
	sleep(1000);
	clickIt(pom.getInstancetproceedcart4().getCheckBox());
	sleep(2000);
	clickIt(pom.getInstancetproceedcart4().getProceedToCart4());
    sleep(1000);
	clickIt(pom.getInstancetproceedchecque().getCheque());
	sleep(2000);
	clickIt(pom.getInstancetproceedconfirmation().getConfirmOrder());
	log.info(" Product COnfirmed Successfully");
	sleep(3000);
	scrollUp_Down(pom.getInstancetproceedscroll().getLastPage());
	sleep(8000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic8.png");
	 org.openqa.selenium.io.FileHandler.copy(source, destination);
	 log.info("output screenshot saved");
}






}
