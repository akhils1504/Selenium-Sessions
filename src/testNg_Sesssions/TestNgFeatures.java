package testNg_Sesssions;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void logintest(){
    System.out.println("Login test Passed");
//    int i=9/0;
	}
	
	@Test ( dependsOnMethods = {"logintest"} )
	public void dashboard() {
	System.out.println("dashboard test passed");	
	
	}
	
	@Test (dependsOnMethods={"logintest","dashboard"})
	public void payment(){
	System.out.println("Dashboard sucess");	
		
	}
		
	}
	
	
