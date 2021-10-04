package testNg_Sesssions;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10)
	public void sum(){
	int a=10,b=10,c=a+b;
	System.out.println("sum iss..."+c);
		
	}

}
