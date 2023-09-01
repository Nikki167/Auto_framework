package Practicemetchod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testdependency {
	
	
		@Test
		public void data1()
		{
			Reporter.log("hi",true);
			
		}

		@Test(dependsOnMethods = "data1")
			public void data2()
			{
				Reporter.log("hello",true);
			
			}
		@Test(dependsOnMethods ="data2")
		public void data3()
		{
			Reporter.log("bye",true);
			
		}
	}


