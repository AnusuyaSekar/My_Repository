	
  Feature: Login functionality of Leaftaps application
  @smoke
  Scenario Outline: Login with valid credentials
#		Given Open the chrome browser
#		Given Load the Application  <Url>
		Given Enter the valid username <UserName>
		Given Enter the valid password <Password>
		When Click on Login button
		Then Homepage should be displayed
	Examples: 
	|UserName|Password|
	|'DemoSalesManager'|'crmsfa'|
	|'DemoCSR'|'crmsfa'|
	
	Scenario Outline: Login with invalid credentials
#		Given Open the chrome browser
#		Given Load the Application  <Url>
		Given Enter the valid username <UserName>
		Given Enter the valid password <Password>
		When Click on Login button
		But Error Message should be displayed
	Examples: 
	|Url|UserName|Password|
	|'http://leaftaps.com/opentaps/control/main'|'Demo'|'crmsfa'|