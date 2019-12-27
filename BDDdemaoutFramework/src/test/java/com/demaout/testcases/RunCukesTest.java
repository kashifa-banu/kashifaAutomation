package com.demaout.testcases;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report",
		"json-pretty:target/cucumber-report.json"},
features = {"classpath:BDDdemaoutFramework/src/resources/com/demaout/testcases/demaout.feature"})

public class RunCukesTest {

}
