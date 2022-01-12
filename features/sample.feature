
Feature:All login cases
@Loginreal
  Scenario : To test Login functionality
  Given  Jump into the login page
  When  Enter correct Username and Password
  And  Click the Login button
  Then  I should able to jump into the Main page

  @Login
  Scenario : To test Login functionality of billing application for valid input
    Given  I am on Login page of billing
    #When  I Enter correct Username and Password on billing
    When  I Enter correct "admin" and "admin" on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard

  @Login
  Scenario : To test Login functionality of billing application for invalid input
    Given  I am on Login page of billing
   # When  I Enter INcorrect Username and Password on billing
    When  I Enter INcorrect "adb" and "asdf" on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard

  @Login
  Scenario : To test Login functionality of billing application for invalid input
    Given  I am on Login page of billing
    #When  I Enter Blank Username and Password on billing
    When  I Enter Blank "  " and "  " on billing
    And  I Click the Login button of billing page
    Then  I should land on dashboard
