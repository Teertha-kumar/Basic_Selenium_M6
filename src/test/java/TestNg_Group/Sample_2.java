package TestNg_Group;

import org.testng.annotations.Test;

public class Sample_2 {
	@Test(groups="smoke")
	public void Sample_2_1()
	{
		System.out.println("Hi Sample_2_1");
	}
	@Test
	public void Sample_2_2()
	{
		System.out.println("Sample_2_2");
}
}