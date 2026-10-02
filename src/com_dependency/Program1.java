package com_dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program1 {
	
	@Test
	public void login()
	{
		System.out.println("Web Login");

		System.out.println("branch 1 code");
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage()
	{
		System.out.println("HomePage");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "homePage")
	public void logout()
	{
		System.out.println("Logout");
	}

}
