Feature: FreeCRM Login Feature
#
#Scenario: FreeCRM login Page scenarion
#
#Given users is allready on FreeCRM login Page
#When title of login page is FreeCRM
#Then user enters "tushartone" and "Tush@1993"
#And user clicks on login button
#And user is on homepage

#Scenario: User is able to create a new contact
#
#Given user is allready on homepage
#When user mouse over on contact link
#Then users click on new contact link
#Then user enter firstname and lastname
#Then user click on login button
#Then verify newly Contact created
#Then close the browser

#With exmaple Keyword >> type of data driven


Scenario Outline: FreeCRM login Page scenarion

Given users is allready on FreeCRM login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
And user clicks on login button
And user is on homepage

Examples:
	| username 	  | password |
	| tushartone  | Tush@1993 |
	| Tom         | Test456 |


