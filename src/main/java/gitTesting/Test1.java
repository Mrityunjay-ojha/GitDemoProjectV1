package gitTesting;

import org.testng.annotations.Test;

public class Test1 
{
	String hungery = "yes";
	@Test
	public void testString()
	{
		try
		{
			if(hungery == "yes")
			{
				System.out.println("eat something.........");
			}
			else
			{
				System.out.println("do job .......");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}
