Feature: facebook login
  as a user i want login to Facebook so i can communicate with my friend

  
  Scenario: Testing hook
    Given open facebook and start application
    When  enter valid username and valid password
    Then  should be login seccessfully
    
     Scenario: Testing hook
    Given open facebookpage and start application
    When  enter valid username and enter valid password
    Then  should be login facebook seccessfully
    
    
      

 