@FunctionalTest
Feature: Frre CRM application Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is valid login test

@RegressionTest
Scenario: Login with invalid username and password
Given This is invalid login test

@SmokeTest
Scenario: Create a contact
Given this is a conatct test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given this is a deal test case

@SmokeTest @RegressionTest
Scenario: Create a Task
Given this is a task test case

@SmokeTest @RegressionTest
Scenario: Create a company
Given this is a company test case

@SmokeTest
Scenario: Create a case
Given this is a casee test case

@SmokeTest
Scenario: verify left panel link
Given clicking on left panel link

@SmokeTest
Scenario: search a deal
Given search a deal test case

@SmokeTest @RegressionTest
Scenario: search a contact
Given search a contatc test case

@SmokeTest @RegressionTest
Scenario: search a case
Given search a case test case

@SmokeTest @End2End
Scenario: search a task
Given search a task test case

@SmokeTest @End2End
Scenario: search a call
Given search a call test case

@SmokeTest @End2End
Scenario: search a comapny
Given search a company test case

@SmokeTest @End2End
Scenario: search a email
Given search a email test case

@SmokeTest @End2End
Scenario: search a form
Given search a form test case

@SmokeTest @End2End
Scenario: validate a s rport
Given validate report test case

@End2End
Scenario: application logout test
Given logout app test case
