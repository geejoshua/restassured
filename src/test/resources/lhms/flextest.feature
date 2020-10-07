Feature: AddChild
  As a Sponsor, I want to add a child to my account

  Scenario: Add a Child from a partner school
    Given a sponsor has an account
    And logs in
    When the customer adds child from partner school
    Then the response code should be 200
    And responsebody includes the child should be added sccessfully