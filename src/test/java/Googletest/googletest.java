package Googletest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import cucumber.api.Scenario;

public class googletest {

	public WebDriver WD;
	@org.testng.annotations.Test
	public void openbrowser(){
		WD=new FirefoxDriver();
		WD.manage().window().maximize();
		WD.get("https://www.google.co.in/");
			
	}
	@AfterMethod
	public void teardown() throws IOException {
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Subu\\selenium\\BDD2\\Screenshot\1.jpg"));
		

			}
}
