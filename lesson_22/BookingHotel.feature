Feature: Test sorting hotels on Booking.com

  Scenario: Test sorting hotels by rate
    Given I am on the main application page
    When I enter the needed destination
    And I enter the needed dates
    And I leave the default amount of guests and rooms
    And I make search
    And I make sure there are hotels that satisfy the search criteria
    And I sort hotels by rate and price
    And I look at the details of the 1st hotel
    Then I make sure its rate is 9 or higher


   	 
 
