Feature: Free CRM Deal data Creation

Scenario: FreeCRM create a new deal scenarion

Given users is allready on FreeCRM login Page
When title of login page is FreeCRM
Then user enters username and password
| tushartone | Tush@1993|
And user clicks on login button
And user is on homepage
And user moves to new deal page
And user click on new deal button
And user enters deal details
|test deal| 100 | 40 | 50 |
And Close the browser
