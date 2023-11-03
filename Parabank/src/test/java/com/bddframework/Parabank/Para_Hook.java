package com.bddframework.Parabank;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Para_Hook {
	@Before
	public static void setUp() {
		Para_Helper_Class.setUpDriver();
	}
	@After
	public static void tearDow(Scenario scenario) {
		Para_Helper_Class.tearDown();
	}
}