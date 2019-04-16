Feature: Free CRM Deal data Creation 

Scenario: FreeCRM create a new deal scenarion 

	Given users is allready on FreeCRM login Page 
	When title of login page is FreeCRM 
	Then user enters username and password 
		| username | password |
		| tushartone | Tush@1993|
	And user clicks on login button 
	And user is on homepage 
	And user moves to new deal page 
	And user click on new deal button 
	And user enters deal details 
		| title | amount | probability | commision |
		|test deal4| 200 | 50 | 40 |
		|test deal2| 300 | 60 | 30 |
		|test deal3| 600 | 70 | 20 |
	And Close the browser 
