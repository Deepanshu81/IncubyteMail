Feature: Verify the functionalities associated to Compose

  Scenario Outline: Verify all the functionalities associated with Composing mail
    Given Browser is open with Gmail Url
    And Logged in through <username> and <password>
    When I click on the Compose button
    Then the frame for writing the compose becomes visible
    When I enter the details in the various sections of the frame such as To <emailid>,CC,BCC and <subject>
    And I press the Send button
    Then Check of the mail is sent by going in sent Section

    Examples: 
      | username         | password       | emailid                    | subject                    |
      | deepanshubhati85 | Monkeydluffy@1 | deepanshubhati85@gmail.com | Email_For_Testing_Cucumber |



  Scenario Outline: Verify the Attach functionality
    Given Browser is open with Gmail Url
    And Logged in through <username> and <password>
    When I click on the Compose button
    Then the frame for writing the compose becomes visible
    When I enter the details in the various sections of the frame such as To <emailid>,CC,BCC and <subject>
    And I click on insert image and insert one image
    And I press the Send button
    Then Check if the email is in the Inbox section

    Examples: 
      | username         | password       | emailid                    | subject                    |
      | deepanshubhati85 | Monkeydluffy@1 | deepanshubhati85@gmail.com | Email_For_Testing_Cucumber |



  Scenario Outline: Verify the Discard Functionality
    Given Browser is open with Gmail Url
    And Logged in through <username> and <password>
    When I click on the Compose button
    Then the frame for writing the compose becomes visible
    When I enter the details in the various sections of the frame such as To <emailid>,CC,BCC and <subject>
    And Press the close button
    Then Check if the email is in the Discard section

    Examples: 
      | username         | password       | emailid                    | subject                    |
      | deepanshubhati85 | Monkeydluffy@1 | deepanshubhati85@gmail.com | Email_For_Testing_Cucumber |
