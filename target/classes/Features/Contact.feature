Feature: Free CRM Create Contact

Scenario Outline: FreeCRM create a new contact scenarion

Given users is allready on FreeCRM login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
And user clicks on login button
And user is on homepage
And user moves to new contact page
And user click on new contact button
And user enters values as "<firstname>" and "<lastname>" and "<position>"
And Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| tushartone | Tush@1993| Tush | To | Manager |
	| tushartone | Tush@1993| David | patu | Director |
	