Feature: Login Feature
  I want to use this template for my feature file

  Scenario: To validate login to amazon website as Authenticated User
    Given User is on Amazon HomePage
    When user navigates to Login Page
    And user enters valid id and password
    Then user logs in successfully and get a success message
