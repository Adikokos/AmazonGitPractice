Feature: Login functionality
  #here we would write the feature name to be tested
  # We create one feature file per feature(functionality)

  #Gherkin ---> Language

  Background: User is on Facebook
    Given User is logged in to https://www.facebook.com/

  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition
    Given User is logged in to https://www.facebook.com/
    # When action
    When User enter test@test.com to email field
    # And
    And User should enter Hello1234 in password input field
    And User should click on Log In button
    # Then validation
    Then User should successfully logged in to the Facebook

    Scenario: Verify user can login with invalid login and valid password
      Given User is logged in to https://www.facebook.com/
      When User enter test@test.com to email field
      And User should enter Hello312 in password input field
      And User should click on Log In button
      Then User should be not able to login