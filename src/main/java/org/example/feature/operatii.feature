Feature: As a mathematician, I want to execute arithmetic operation on numbers, so I can check results.

  Scenario: I want to sum up 2 intigers
    Given I have a calculator
    When I sum up 7 and 8
    Then I expect the result to be 15

  Scenario: I want to sum up integers
    Given I have a calculator
    When I sum up 7, 8, 9, 10
    Then I expect the result to be 34

  Scenario: I want to sum multiplay two intigers
    Given I have a calculator
    When I sum up 7 and 10
    When I multiply 19 by 2 times
    Then I expect the result to be 17