package com.selenium.browsers;

public class TC_001 extends BaseTest{

	public static void main(String[] args) throws Exception {
		
		init();
		
		launch("chromebrowser");
		navigateurl("amazonurl");
		
	}

}
