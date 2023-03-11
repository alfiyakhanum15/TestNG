package com.example;

import org.testng.annotations.Test;

public class TestNGIgnore {

	@Test(enabled = false)
	public void display() {
		System.out.println("Welcome To Java");
	}

	@Test
	public void displayTwo() {
		System.out.println("Welcome To displayTwo");
	}
}
