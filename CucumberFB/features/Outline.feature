Feature: facebook login with multipole data set
  as a tester i want login to Facebook with data set so i can test

  Scenario Outline: data set
    Given open chrome browser and start application
    When I enter "<username>" and "<password>"
    Then user should be login
    Then facebook should be closed

    Examples: 
      | username         | password |
      | faruq@gmail.com  | abc123   |
      | khalid@yahoo.com | xyz123   |
      | farid@ymail.com  | efg123   |
