package framework1;

import org.testng.annotations.Test;
@Test(groups = {"Functional"})
public class Groups {
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("Compose");
	}
@Test(groups = {"sanity","regression"})
public void test2()
{
	System.out.println("Sent Items");
}
@Test(groups = {"regression"})
public void test3()
{
	System.out.println("Trash");
}
}
