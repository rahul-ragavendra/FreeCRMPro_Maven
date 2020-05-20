package com.freecrmpro.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.freecrmpro.base.Testbase;

public class LoginTest extends Testbase {

	public LoginTest() throws FileNotFoundException, IOException {
		super();
	}
	
	@BeforeMethod
	public static void setup(){
		invokebrowser();
		
	}
	
	

}
