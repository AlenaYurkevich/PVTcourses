@apiVK
Feature: Test cases with VK API

Scenario: Post message on the wall
    Given I'm on Denis' vk test page
    When I post message on the wall
    When I make screenshot
    Then Message is posted
   
Scenario: Test editing of the previously added message 
    Given I'm on Denis' vk test page
    When I edit the message I've left on the wall
    When I make screenshot
    Then Message is edited
    
Scenario: Test adding a comment to the post
    Given I'm on Denis' vk test page
    When I leave a comment under the previously added post
    When I make screenshot
    Then Comment is added
 
Scenario: Test deleting the previously added message
    Given I'm on Denis' vk test page
    When I delete my message from the wall
    When I make screenshot
    Then Message is deleted
    



   	 
 
