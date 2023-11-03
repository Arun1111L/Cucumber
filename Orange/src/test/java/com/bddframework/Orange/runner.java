package com.bddframework.Orange;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@valid_Credentials2" ,features= "src/test/resources/feat/multior.feature", glue= "com.bddframework.Orange")
public class runner {
}
