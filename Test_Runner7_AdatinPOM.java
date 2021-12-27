package com.Runner1;


	import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import com.Dec_Mini_Project.Addatin_PageObjectManager;
import com.Dec_Mini_Project.Base_Class;
import com.Dec_Mini_Project.PageObjectManager;
	
	public class Test_Runner7_AdatinPOM extends Base_Class{ 
		public static WebDriver driver =getBrowser("chrome");
		public static Addatin_PageObjectManager  pom =new Addatin_PageObjectManager (driver);
		public static Logger log =Logger.getLogger(Test_Runner3.class);
		public static void main(String[] args) throws Throwable {
			PropertyConfigurator.configure("log4j.properties");
			url("https://adactinhotelapp.com/");
			sleep(2000);
			inputValueElement(pom.getinstanceHp().getUsername(), "LGMVina22");
			sleep(1000);
			inputValueElement(pom.getinstanceHp().getPassword(), "lg61071@gmail.com");
			clickIt(pom.getinstanceHp().getSubmitLogin());
			log.info("login successfull");
			sleep(10000);
			dropdown("index",pom.getinstanceHs().getLocation(),"2");
			sleep(15000);
			dropdown("Text",pom.getinstanceHs().getHotel(), "Hotel Sunshine");
			sleep(20000);
			dropdown("index",pom.getinstanceHs().getRoomType(), "2");
			sleep(20000);
			dropdown("index",pom.getinstanceHs().getRoomNos(), "2");
			sleep(10000);
			inputValueElement(pom.getinstanceHs().getDatePickIn(), "14/12/2021");
			sleep(10000);
			inputValueElement(pom.getinstanceHs().getDatePickOut(), "16/12/2021");
			sleep(10000);
			dropdown("Byvalue",pom.getinstanceHs().getAdultRoom(), "2");
			sleep(10000);
			dropdown("index",pom.getinstanceHs().getChildRoom(),  "2");
			log.info("Rooms available ");
			sleep(10000);
			clickIt(pom.getinstanceHs().getSubmit());
			clickIt(pom.getinstanceSh().getRadioButton());
			sleep(2000);
			clickIt(pom.getinstanceSh().getContinue());
			log.info("Rooms Selected");
			sleep(2000);
			inputValueElement(pom.getinstanceAp().getFirstName(),"Logav");
			inputValueElement(pom.getinstanceAp().getLastName(),"Logav");
			inputValueElement(pom.getinstanceAp().getAddress(),"6808 south blvd , Mary land, Tx zip:40584");
			inputValueElement(pom.getinstanceAp().getCCNum(),"1234123412341234");
			dropdown("index",pom.getinstanceAp().getCCType(),"2");
			dropdown("text",pom.getinstanceAp().getCCExpMonth(),"October");
			dropdown("index",pom.getinstanceAp().getCCExpYear(),"4");
			inputValueElement(pom.getinstanceAp().getCCCVV(),"789");
			log.info("Address&Payment details provided");
			sleep(1000);
			clickIt(pom.getinstanceAp().getBookNow());
			log.info("Room Booked");
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic9.png");
			 org.openqa.selenium.io.FileHandler.copy(source, destination);
			 log.info("output Saved");
			
			
			
		}
	    

}
