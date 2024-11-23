  Feature: Create Lead functionality of Leaftaps application
  @smoke
  Scenario Outline: Title of your scenario outline
    Given Enter the valid username <UserName>
		Given Enter the valid password <Password>
		When Click on Login button
		Then Homepage should be displayed
		When Click on "CRM/SFA"
		Then "My Homepage" should be displayed
		When Click on "Leads" 
		Then "My Leads" should be displayed  
		When Click on "Create Lead" 
		Then "Create Lead" should be displayed 
	Examples: 
	|UserName|Password|
	|'DemoSalesManager'|'crmsfa'|

   
