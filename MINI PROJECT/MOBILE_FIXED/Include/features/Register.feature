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
@register
Feature: Register
As a user i want to successfully register account

  @register1
  Scenario Outline: Register with valid data
    Given I open application for register 
    When I open register form for register
    When I fill username in field username <username>
    When I fill email in field email <email>
    When I fill password in field password <password>
    When I click register button
    Then I verify successfully register and navigated to home page

    	Examples: 
      |username  				| email 								| password  		|
      |anggitan666 			|anggitan666@gmail.com	| anggitan666 	|