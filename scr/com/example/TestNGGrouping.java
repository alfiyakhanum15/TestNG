package com.example;

import org.testng.annotations.Test;

public class TestNGGrouping {
	@Test(groups = { "group1", "group2" })
	public void displayOne() {
		System.out.println("Display One!!");
	}

	@Test(groups = { "group3", "group2" })
	public void displayTwo() {
		System.out.println("Display Two!!");
	}

	@Test(groups = { "group1", "group5" })
	public void displayThree() {
		System.out.println("Display Three!!");
	}

	@Test(groups = { "group1", "group6" })
	public void displayFour() {
		System.out.println("Display Four!!");
	}

}
