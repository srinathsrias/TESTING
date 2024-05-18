@log @E2E
Feature: To validate Login Functionalities of BuildWith.

  Background: 
    Given The user should be in the home page of the application.

  @smoke
  Scenario: To validate Login with Valid data_1.
    Then The user should click "login" button.
    And The user should enter emailid and password.
      | srinathsrinathas2910@gmail.com |
      |                     6381486988 |
    Then The user should click the login button.
    And The user will be in login page.

  @regression
  Scenario: To validate Login with Valid data_2.
    Then The user should click "login" button.
    And The user should enter emailid and password.
      | pathma3402@gmail.com |
      |           9360772960 |
    Then The user should click the login button.
    And The user will be in login page.

  @sanity
  Scenario: To validate Login with Valid data_3.
    Then The user should click "login" button.
    And The user should enter emailid and password.
      | pdharanibvn@gmail.com |
      |            9566858082 |
    Then The user should click the login button.
    And The user will be in login page.

  @retest
  Scenario: To validate Login with Valid data_4.
    Then The user should click "login" button.
    And The user should enter emailid and password.
      | shandhini2001@gmail.com |
      |              8300366445 |
    Then The user should click the login button.
    And The user will be in login page.
