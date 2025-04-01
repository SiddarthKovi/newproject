@Smoke
Feature: check the sauce demo page

Scenario: Validate the sauce login with valid Credentiles

Given User is on sauce demo login page
When User enters valid username and password
And User hits login button
Then  User is navigated to the home page