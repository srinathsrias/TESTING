Feature: To validate the functionalities of demo site.

  Scenario Outline: To validate demo site with valide datas.
    Given The user should be in the home page of the applicaion
    Then The user should enter "<Username>" and "<Password>".
    And The user need to click login button.
    Then The user need to click orders and click the add bulk orders.
    And The user need to upload the demo_data file and click import button.
    Then The user need to click validate data button and handle the alert message.
    And The user need to scroll_down and take screenshot.

    Examples: 
      | Username                | Password                |
      | prexo.mis@dealsdray.com | prexo.mis@dealsdray.com |
