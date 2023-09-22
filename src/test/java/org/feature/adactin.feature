Feature: Adactin application


@Login
Scenario: Login functionality
Given Launch the url
When User enters the username in the username field
And User enters the password in the password field
And User clicks on login button
Then User gets navigated to the Search hotels page

@hotel
Scenario: Search hotel functionality
Given User should get navigated to Search hotel page
When User selects an location from the dropdown