Feature: Login Functionality of HRM Web Application2
@valid_Credentials2
Scenario Outline: Verification of login using Invalid credentials
Given  is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When  enter valid username as "<username2>"
And  enter valid password as "<password2>"
And  click loginButton
Then  should be able to login successfully

	Examples:
| username | password |
| Admin1   | admin1   |
| admin1   | admin123 |
| Admin    | admin    |
|          |          |