package com.Runner1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Dec_Mini_Project.Adactin_AddressPage;
import com.Dec_Mini_Project.Adactin_Homepage;
import com.Dec_Mini_Project.Adactin_HotelSearch_Page;
import com.Dec_Mini_Project.Adactin_HotelSelection_Page;
import com.Dec_Mini_Project.Base_Class;
public class Test_Runner4_Adactin extends Base_Class{
	static WebDriver driver = getBrowser("chrome");
	static Adactin_Homepage Hp = new Adactin_Homepage(driver);
	static Adactin_HotelSearch_Page Hs= new Adactin_HotelSearch_Page(driver);
	static Adactin_HotelSelection_Page Sh= new Adactin_HotelSelection_Page(driver);
	static Adactin_AddressPage Ap = new Adactin_AddressPage(driver);
	public static void main(String[] args) throws Throwable {
		url("https://adactinhotelapp.com/");
		sleep(2000);
		inputValueElement(Hp.getUsername(), "LGMVina22");
		sleep(1000);
		inputValueElement(Hp.getPassword(), "lg61071@gmail.com");
		clickIt(Hp.getSubmitLogin());
		sleep(10000);
		dropdown("index",Hs.getLocation(),"2");
		sleep(15000);
		dropdown("Text",Hs.getHotel(), "Hotel Sunshine");
		sleep(20000);
		dropdown("index",Hs.getRoomType(), "2");
		sleep(20000);
		dropdown("index",Hs.getRoomNos(), "2");
		sleep(10000);
		inputValueElement(Hs.getDatePickIn(), "14/12/2021");
		sleep(10000);
		inputValueElement(Hs.getDatePickOut(), "16/12/2021");
		sleep(10000);
		dropdown("Byvalue",Hs.getAdultRoom(), "2");
		sleep(10000);
		dropdown("index",Hs.getChildRoom(),  "2");
		sleep(10000);
		clickIt(Hs.getSubmit());
		clickIt(Sh.getRadioButton());
		sleep(2000);
		clickIt(Sh.getContinue());
		sleep(2000);
		inputValueElement(Ap.getFirstName(),"Logav");
		inputValueElement(Ap.getLastName(),"Logav");
		inputValueElement(Ap.getAddress(),"6808 south blvd , Mary land, Tx zip:40584");
		inputValueElement(Ap.getCCNum(),"1234123412341234");
		dropdown("index",Ap.getCCType(),"2");
		dropdown("index",Ap.getCCExpMonth(),"3");
		dropdown("index",Ap.getCCExpYear(),"4");
		inputValueElement(Ap.getCCCVV(),"789");
		clickIt(Ap.getBookNow());
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic9.png");
		 org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		
		
	}
    



    
    
    
    
}