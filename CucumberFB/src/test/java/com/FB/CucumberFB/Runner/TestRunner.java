package com.FB.CucumberFB.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="features",
glue={"com.FB.CucumberFB.StepDefination"},

 tags="@system", //tag befor feature will run whole class
//tags="~sanity", //~ this sign will escape that scenario
//tags="@smoke, @sanity", //this is or condition. 
//if scenario has one of the tag it will run the scenario.
 //tags="@regressional, @functional",
 // tags = {" @regressional","@functional"}, 
////this is and condition. if scenario has both of the tag,
//it will run the scenario.
// name= {"ebay"}, // name will run from matching word from scenario line.
               //it also take regular expression. 
monochrome=true,
plugin={"html:target/cucumber-html-report"}
		)

public class TestRunner {

}
