package framework1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testpriority {
	
		@Test(priority = 1)
		public void data1()
		{
			Reporter.log("hi",true);
			
		}

		@Test
			public void data2()
			{
				Reporter.log("hello",true);
				
			}
	}



