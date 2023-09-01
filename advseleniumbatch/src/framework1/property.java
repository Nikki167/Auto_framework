package framework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class property {
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./framework1/p.properties"));
		String value = p.getProperty("baseurl");
		System.out.println(value);
	
	}
}
