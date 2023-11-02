Feature: log into Orange HRM Application

Scenario: Verify the login with valid credentials
Given  go to url page
When  type the valid username 
And  type the valid password 
And  click loginButton for login
Then  Check weather the login accure