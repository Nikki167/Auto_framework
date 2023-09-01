package framework1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testmultiple {
		@Test(priority = 1,invocationCount = 5)
		public void data1()
		{
			Reporter.log("hi",true);
			
		}

		@Test(invocationCount = 3)
			public void data2()
			{
				Reporter.log("hello",true);
				
			}
	}


