package com.launch;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		browserLaunch("chromebrowser");
		
		navigateUrl("amazonurl");

	}

}
