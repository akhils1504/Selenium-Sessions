package testNg_Sesssions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionTimeOutTest {
	
	@Test(invocationTimeOut=2,expectedExceptions=ThreadTimeoutException.class)   ////maximun time it should take is 2s..within that it should pass/fail
	public void infiniteLoopTest(){
		int i=1;
		while(i==1)
			System.out.println(i);
				
	}

}
