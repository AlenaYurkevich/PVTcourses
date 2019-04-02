@emails
Feature: Test cases with Mail.ru
	
Scenario: Log out
	When I log in my account
	When I click Logout link
	When I make a screenshot
	Then I am logged out
	
Scenario: Put email to spam
    When I log in the account
    When I check the first email checkbox and click the Spam button
    When I make the screenshot
    Then Notification about successful moving to Spam is displayed
    
Scenario: Mark and unmark some emails with flags
    When I log into mail.ru
    When I mark three emails with flags
    When I make one screenshot
    Then the emails are flagged
    When I remove flags
    When I make one screenshot
    Then the emails are not flagged
    
Scenario: Send email to several addressees
	When I enter addressees, subject, text and click Send

Scenario: Try to log in with incorrect credentials
	When I log in with incorrect username and password taken from xml
	When I make my screenshot
	Then I see the error message

Scenario: Put email from spam to Inbox
	When I log in my email
	When I go to Spam
	When I return an email back to Inbox
	When I make another screenshot
	Then Notification about successful moving to Inbox is displayed
    



   	 
 
