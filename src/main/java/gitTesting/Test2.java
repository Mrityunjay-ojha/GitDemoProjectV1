package gitTesting;

import org.testng.annotations.Test;

public class Test2 
{
	String newReq = "yes";
	@Test
	public void testString()
	{
		try
		{
			if(newReq == "yes")
			{
				System.out.println("Welcome to Board.........");
			}
			else
			{
				System.out.println("Updated .......");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}
