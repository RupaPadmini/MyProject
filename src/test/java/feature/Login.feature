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
Feature: Login Button Testing
  I want to use this template for my feature file

  @tag2
  Scenario: Clicking on Login button on homepage
    Given User must be on homepage by clicking on url
    When click on Login button
    And Enter valid username and password
    And User clicks on Login button
    Then User account should be opened

  Scenario: Item should be added to the cart
    When Click on Laptops
    And Click on any Laptop name
    Then Click on Add to cart button
    And Click on Cart button to verify the product is added
