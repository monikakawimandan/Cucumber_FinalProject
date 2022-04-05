#Author: monikakawimandan@gmail.com
#Keywords Summary : Cucumber project - Background Color Change Verfication

Feature: The background color should be set as skyblue color


@Scenario1
Scenario: 1 Sky Blue Background
	Given Set SkyBlue Background button exists 
	When I click on the button 
	Then the background color will change to sky blue

@Scenario2
Scenario: 2 White Background Change
	Given Set SkyWhite Background button exists 
	When I click on the Set white button 
	Then the background color will change to white