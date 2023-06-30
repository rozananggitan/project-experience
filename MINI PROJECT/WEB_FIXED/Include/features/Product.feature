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
@product
Feature: Product
  As a user i want to successfully view product and add product

  @product1
  Scenario Outline: View details product with login account
    Given I open website https://alta-shop.vercel.app/
    When I open login page for login my account
    And I fill valid email for add and view product in field email <email1> 
    And I fill valid password for add and view product in field password <password1>
    And I click login button for login my account
    And I navigated to home page
    And I choose product and click details product
    Then Navigated to detail page
    
    Examples: 
    |email1									| password1		|
    |anggitan7272@gmail.com	| anggitan777	|
    
   @product2
   Scenario: View details product without login account
    Given I open website https://alta-shop.vercel.app/
    When I navigated to home page for view product
    And I choose and click details product for view details product without login account
    Then Navigated to detail page product without login account
    
   @product3
   Scenario Outline: Add product with login account
    Given I open website https://alta-shop.vercel.app/
    When I open login page for login my account
    And I fill valid email for add and view product in field email <email1> 
    And I fill valid password for add and view product in field password <password1>
    And I click login button for login my account
    And I navigated to home page
    And I choose and click button buy product
    Then Successfully add product then navigated to transaction page
    
    Examples: 
    |email1									| password1		|
    |anggitan7272@gmail.com	| anggitan777	|
        
   @product4
   Scenario: Add product without login account
    Given I open website https://alta-shop.vercel.app/
    When I navigated to home page for view product
    And I choose and click button buy product for view transaction page without login account
    Then Successfully add product then navigated to transaction page without login account 
       