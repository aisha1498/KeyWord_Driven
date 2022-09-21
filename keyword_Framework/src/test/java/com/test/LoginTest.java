package com.test;
import org.testng.annotations.Test;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.qa.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;

	@Test
	public void loginTest() throws InvalidFormatException  {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Login");
	}
	@Test
	public void signUpTest() throws InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("SignUp");
	}

}
