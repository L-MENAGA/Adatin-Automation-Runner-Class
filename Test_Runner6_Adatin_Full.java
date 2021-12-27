package com.Runner1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Dec_Mini_Project.Addatin_PageObjectManager;
import com.Dec_Mini_Project.Base_Class;

import propety_File.file_Reader_Manager;

public class Test_Runner6_Adatin_Full extends Base_Class{ 
	public static WebDriver driver =getBrowser("chrome");
	public static Addatin_PageObjectManager  pom =new Addatin_PageObjectManager (driver);
	public static Logger log =Logger.getLogger(Test_Runner3.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		//url("https://adactinhotelapp.com/");
		String url =file_Reader_Manager.getInstanceFRM().getInstanceCR().getAdactinurl();
		url(url);
		sleep(2000);
		String Username =file_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		inputValueElement(pom.getinstanceHp().getUsername(), Username);
		sleep(1000);
		String Password =file_Reader_Manager.getInstanceFRM().getInstanceCR().getAdatinPassword();
	     inputValueElement(pom.getinstanceHp().getPassword(), Password);
		clickIt(pom.getinstanceHp().getSubmitLogin());
		log.info("login successfull");
		sleep(10000);
		String Location = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 4,5 );
		dropdown("index",pom.getinstanceHs().getLocation(),Location);
		sleep(15000);
		String Hotel = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 5,5 );
		dropdown("Text",pom.getinstanceHs().getHotel(), Hotel);
		sleep(20000);
		String RoomType = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 6,5 );
		dropdown("index",pom.getinstanceHs().getRoomType(), RoomType);
		sleep(20000);
		String RoomNos = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 7,5 );
		dropdown("index",pom.getinstanceHs().getRoomNos(), RoomNos);
		sleep(10000);
		String DateIn = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 8,5 );
		inputValueElement(pom.getinstanceHs().getDatePickIn(), DateIn);
		sleep(10000);
		String DateOut = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 9,5 );
		inputValueElement(pom.getinstanceHs().getDatePickOut(), DateOut);
		sleep(10000);
		String AdultRoom = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 10,5 );
		dropdown("Byvalue",pom.getinstanceHs().getAdultRoom(), AdultRoom);
		sleep(10000);
		String ChidlrenRoom = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 11,5 );
		dropdown("index",pom.getinstanceHs().getChildRoom(),  ChidlrenRoom);
		log.info("Rooms available ");
		sleep(10000);
		clickIt(pom.getinstanceHs().getSubmit());
		clickIt(pom.getinstanceSh().getRadioButton());
		sleep(2000);
		clickIt(pom.getinstanceSh().getContinue());
		log.info("Rooms Selected");
		sleep(2000);
		String Firstname = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 16,5 );
		inputValueElement(pom.getinstanceAp().getFirstName(),Firstname);
		String LastName = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 17,5 );
		inputValueElement(pom.getinstanceAp().getLastName(),LastName);
		String Address = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 18,5 );
		inputValueElement(pom.getinstanceAp().getAddress(),Address);
		String CCNUM = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 19,5 );
		inputValueElement(pom.getinstanceAp().getCCNum(),CCNUM);
		String CCTYPE = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 20,5 );
		dropdown("index",pom.getinstanceAp().getCCType(),CCTYPE);
		String CCMonth = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 21,5 );
		dropdown("text",pom.getinstanceAp().getCCExpMonth(),CCMonth);
		String CCYear = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 22,5 );
		dropdown("index",pom.getinstanceAp().getCCExpYear(),CCYear);
		String CVV = inputData_From_Excel ("C:\\Users\\ELCOT\\Desktop\\Selenium\\Test Case_Adactin Hotel Booking.xlsx", 23,5 );
		inputValueElement(pom.getinstanceAp().getCCCVV(),CVV);
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
