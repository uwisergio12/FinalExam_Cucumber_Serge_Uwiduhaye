@Regression
Feature: Set Background Color of techfios page

@Scenario1
Scenario: SkyBlue Background
	Given Set SkyBlue Background button exists  
	When I click on the "Set SkyBlue Background" button 
	Then the background color will change to skyblue

@Scenario2
Scenario: White Background
   Given Set White Background button exists 
   When I click on the "Set White Background" button 
   Then the background color will change to white
