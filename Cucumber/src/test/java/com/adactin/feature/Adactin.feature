Feature: Testing Adactin Application end to end process
Scenario: Verify the user is able to login the application
Given launch  application
When enter   username "username"
And enter  password 
And  click login button
Then navigation to search hotel page

Scenario: verify user is able to search for hotel
And select location
And select hotel
And select type of room
And select no of rooms
And select check in date
And select check out date
And select no of adult per room
And select no of child per room

Scenario: verify  user is able to select the hotel
Then navigation to select hotel page
And select the hotel
And click continue

Scenario: verify user is able to book a hotel
Then navigation to book hotel page
And enter firstname
And enter lastname
And enter address
And enter credit card no
And enter credit card expiry month
And enter credit card expiry year
And enter ccv no
And click logout
