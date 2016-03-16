Feature: Calculator
    As a user
    I want to use a calculator 
    So that I can add,substract,multiple or devide two numbers

Scenario: Add two numbers
    Given I have a calculator
    When I add 3 and 3
    Then the result should be 6

Scenario: Substract two numbers
    Given I have a calculator for substraction
    When I substract 7 and 10
    Then the result for substraction should be -3

Scenario: Multiple two numbers and devide the result with a number
    Given I have a calculator for multiplication and devision
    When I multiple 20 and 2
    And devide by 4
    Then the result for mul and dev should be 10
