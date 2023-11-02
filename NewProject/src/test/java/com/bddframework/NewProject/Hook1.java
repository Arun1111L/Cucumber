package com.bddframework.NewProject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook1 {
	@Before
	public static void setUp() {
		Helper_Class1.setUpDriver();
	}
	@After
	public static void tearDow(Scenario scenario) {
		Helper_Class1.tearDown();
	}
}