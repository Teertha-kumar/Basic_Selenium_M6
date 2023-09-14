package TestNg_Group;

import org.testng.annotations.Test;

public class Sample_1 {

@Test(groups="smoke")
public void Sample_1_1()
{
	System.out.println("Hi Sample_1_1");
}
@Test
public void Sample_1_2()
{
	System.out.println("Sample_1_2");
}
}