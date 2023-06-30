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
@tag
Feature: Register
  As a user i want successfully register account

  @tag1
  Scenario Outline: Register with valid data
    Given I open website altashop https://alta-shop.vercel.app/
    When I open register form for create new account
    And I fill username in field username <username>
    And I fill email in field email <email>
    And I fill password in field password <password>
    And I click register button for register account
    Then I successfully register account and navigated to login page

    Examples: 
      | username  		| email										| password		|	
      | anggitan7272	| anggitan7272@gmail.com	| anggitan777	|	