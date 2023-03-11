package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSequense {

	@BeforeSuite
	public void beforSuite() {
		System.out.println("Display beforSuite !!");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Display afterSuite !!");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Display beforeTest !!");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Display afterTest !!");
	}

	@BeforeMethod
	public void beforeMehthod() {
		System.out.println("Display beforeMehthod !!");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Display afterMethod !!");
	}
	
	@Test
	public void displayOne() {
		System.out.println("Display One !!");
	}
}
