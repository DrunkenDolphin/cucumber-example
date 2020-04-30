@foo
Feature: Basic Arithmetic

  Scenario: Addition
    Given 2 and 2
    When I add them
    Then the result is 4

  Scenario: Addition bigInteger
    Given 0.3 and 0.07
    When I add them
    Then the result is 0.37

  Scenario: Divide by zero
    Given 4 and 0
    When I divide them
    Then it fails


  Scenario: Divide
    Given 4 and 2
    When I divide them
    Then the result is 2

    Scenario: Factorial
      Given 6
      When I factorial it
      Then result is 720

  Scenario: FactorialBig
    Given 21
    When I factorial it
    Then result is 51090942171709440000