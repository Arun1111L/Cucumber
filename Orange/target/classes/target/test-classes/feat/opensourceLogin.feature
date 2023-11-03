Feature: Login Functionality of HRM Web Application



@valid_Credentials
Scenario: Verification of login using valid credentials
Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter valid username as "Admin"
And user enter valid password as "admin123"
And user click loginButton
Then user should be able to login successfully

@Ivvalid_Credentials
Scenario: Verification of login using Invalid credentials
Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter valid username as "Admin"
And user enter valid password as "admin111"
And user click loginButton
Then user shouldnot able to login bcz of invalid Password

@Ivvalid_Credentials @Blank_Credentials
Scenario: Verification of login using Invalid credentials and Blank credentials
Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter valid username as "Admi"
And user enter valid password as " "
And user click loginButton
Then user shouldnot able to login bcz of invalid Password message required