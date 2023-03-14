package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\kesh\\MavenCucu\\src\\test\\resources\\Demo.Feature")//glue="org.stepdefinition1")

public class TestRunner {

}
