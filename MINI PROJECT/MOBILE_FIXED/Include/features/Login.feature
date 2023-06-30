#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login
As a user i want to successfully login account

  @register1
  Scenario Outline: Login with valid data
    Given I open application for login 
    When I open login page
    When I click login button
    Then I verify successfully login and navigated to home page

    	Examples: 
			| email1 								| password1  		|
			|anggitan666@gmail.com	| anggitan666 	|