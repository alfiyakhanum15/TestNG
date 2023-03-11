package com.example;

import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority=2, enabled=false)
	public void display() {
		System.out.println("Welcome To Java");
	}

	@Test(priority=1)
	public void displayTwo() {
		System.out.println("print displayTwo");
	}

}
