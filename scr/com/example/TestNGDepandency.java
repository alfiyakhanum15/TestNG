package com.example;

import org.testng.annotations.Test;

public class TestNGDepandency {
	
	@Test(enabled=true)
	public void display() {
		System.out.println("Welcome To Java");
	}

	@Test(dependsOnMethods = "display")
	public void displayTwo() {
		System.out.println("Welcome To displayTwo");
	}
}
