Feature: To Register and login in Parabank

Scenario: Register the User details
Given User is on the Parabank Register page
When user enter the FirstName
And user enter the LastName
And user enter the Address
And user enter the City
And user enter the State
And user enter the ZipCode 
And user enter the Phone 
And user enter the SSN
And user enter the Username
And user enter the Password
And user enter the Confirm
And user click the RegisterButton
Then check user is in Welcomepage
Then click logout button