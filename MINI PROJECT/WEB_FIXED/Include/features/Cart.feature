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
Feature: Cart 
I want successfully add and reduced quantity page 

  @tag1
  Scenario Outline: User can add product quantity on the cart page with login account
    Given I open website https://alta-shop.vercel.app/
    When I open login page for login my account
    And I fill valid email for add and view product in field email <email1> 
    And I fill valid password for add and view product in field password <password1>
    And I click login button for login my account
    And I navigated to home page
    And I choose and click button buy product and edit quantity product
    And I click icon cart for edit quantity
    And I click button + for add quantity product
    Then I verify successfully quantity product was added

    Examples: 
    |email1									| password1		|
    |anggitan7272@gmail.com	| anggitan777	|
    
    
  @tag2
  Scenario Outline: User can add product quantity on the cart page with login account
    And I click icon cart for edit quantity 
    And I click button - for reduced quantity product
    Then I verify successfully quantity product was reduced
    Examples: 
    |email1									| password1		|
    |anggitan7272@gmail.com	| anggitan777	|