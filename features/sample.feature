
Feature:All login scenarios

  Background: before all scenario
    Given browser is opend
    When url is entered
@Loginreal
  Scenario: To test Login functionality
  Given  Jump into the login page
  When  Enter correct Username and Password
  And  Click the Login button
  Then  I should able to jump into the Main page

  @Login
  Scenario: To test Login functionality of billing application for valid input
    Given  I am on Login page of billing
    #When  I Enter correct Username and Password on billing
    When  I Enter correct "admin" and "admin" on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard

  @Login
  Scenario: To test Login functionality of billing application for invalid input
    Given  I am on Login page of billing
   # When  I Enter INcorrect Username and Password on billing
    When  I Enter INcorrect "adb" and "asdf" on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard

  @Login
  Scenario: To test Login functionality of billing application for invalid input
    Given  I am on Login page of billing
    #When  I Enter Blank Username and Password on billing
    When  I Enter Blank "  " and "  " on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard

    @Login02
    Scenario: To test the fuctionality of submit button
      Given I am on user registration page
      When I enter below data
      |rahul|rahulgany@gmail.com|434343|Mumbai|
      And I click on Submit button
      Then user should be added

  @Login03
  Scenario Outline: To test the fuctionality of submit button
    Given I am on user registration page
    When I enter <name>,<email>,<phone>
    And I click on Submit button
    Then user should be added
    Examples:
      | name    | email                | phone |
      |rahul    |rahulgany@gmail.com   |434341 |
      |gany     |rahulgany@gmail.com   |434342|
      |rahulgany|rahulgany@gmail.com   |434343|
      |ganyrahul|rahulgany@gmail.com   |434344|
      |rahul.gany|rahulgany@gmail.com  |434345|
      |rahul123|rahulgany@gmail.com    |434346|
      |gany123|rahulgany@gmail.com     |434347|