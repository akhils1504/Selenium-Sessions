package testNg_Sesssions;

import org.junit.AfterClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestNgBasics {
	//Precondition annotataions ---Starting with @Before
	@BeforeSuite//1
	public void Setup(){
		System.out.println("setup propety for chrome");
		
	}
	
	@BeforeTest//2
	public void launchBrowser(){
		System.out.println("Launch chrome browser");
	}
	
	
	@BeforeClass//3
	public void login(){
		System.out.println("Login to app");
	}	
	/*
	 * @Before meathod
	 * Test1
	 * @After Meathod
	 * 
	 * @Before Meathod
	 * Test2
	 * @After Meathod
	 * 
	 */
	
	@BeforeMethod//4     ///if multiple test is there sequence is @before meathod, @test and @aftermeathod
	public void enterURL(){
		System.out.println("Enter URl");
		
	}
	//test case --starting with @test
	@Test//5
	public void googleTitelTest()
	{
		System.out.println("Google Title Test");
	}
	//post condtion --starting with @after
	
	@Test
	public void searchText(){
		System.out.println("search Text");
	}
	
	@AfterMethod//6
	public void logout()
	{
	System.out.println("logout from app");	
	}
	
	@AfterClass//7
	public void closeBrowser(){
		System.out.println("close browser");
	}
	
	
	@AfterTest//8
	public void deleteallcookies(){
		System.out.println("delete all cookies");
	}

	
//    @AfterSuite//9
//    public void generatereport(){
//    	System.out.println("generate report");
//    }

	

}
