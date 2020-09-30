package com.cg.ddms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features")

//,glue= {"stepDefinition"},tags= {"@valid"},plugin= {"pretty","html:test-output/RGoutline","json:json_output/cucumber-report-RGoutline","junit:junit_xml/cucumber.xml-RGoutline"},monochrome=true)
public class TestRunner {


		
	

}
