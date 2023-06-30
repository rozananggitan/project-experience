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
  As a user i want successfully login account

  @login1
  Scenario Outline: Login with valid email and password 
    Given I open website altashop https://alta-shop.vercel.app/ for login account
    When I open login page
    And I fill valid email <email1>
    And I fill valid password <password1>
    And I click button login for login account
    Then I verify successfully login and navigated to home page

    Examples: 
    |email1									| password1		|
    |anggitan7272@gmail.com	| anggitan777	|
    
    @login2
    Scenario Outline: Login with invalid email and valid password
    Given I open website altashop https://alta-shop.vercel.app/ for login account
    When I open login page
    And I fill invalid email <email2>
    And I fill valid password <password1>
    And I click button login for login account
    Then I verify unsuccessfully login with invalid email
    
    Examples:
    |email2						|
    |anggitan7272			|
    
    @login3
    Scenario Outline: Login with valid email and invalid password
    Given I open website altashop https://alta-shop.vercel.app/ for login account
    When I open login page
    And I fill valid email <email1>
    And I fill invalid password <password2>
    And I click button login for login account
    Then I verify unsuccessfully login with invalid password
    
    Examples:
    |password2		|
    |anggitan7777	|
    
    @login4
    Scenario Outline: Login with blank email and valid password
    Given I open website altashop https://alta-shop.vercel.app/ for login account
    When I open login page
    And I fill blank email <email3>
    And I fill valid password <password1>
    And I click button login for login account
    Then I verify unsuccessfully login with blank email
    
    Examples:
    |email3 |
    |*null* |
    
    @login5
    Scenario Outline: Login with valid email and blank password
    Given I open website altashop https://alta-shop.vercel.app/ for login account
    When I open login page
    And I fill valid email <email1>
    And I fill blank password <password3>
    And I click button login for login account
    Then I verify unsuccessfully login with blank password
    
    Examples:
    |password3|
    |*null* 	|