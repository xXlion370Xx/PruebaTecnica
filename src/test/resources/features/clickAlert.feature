Feature: Click on button alerts

  Scenario: A user want to click on alerts
    Given the user is on page demoqa
    When The user click on Alerts, Frame and Windows
    And Click alerts
    Then Validate fourth alerts