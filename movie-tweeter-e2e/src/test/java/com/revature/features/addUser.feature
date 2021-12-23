Feature: Add User

Scenario Outline: Invalid password and/or invalid employee username (negative test)
Given I am at the signup module
When I type in a username of <username>
And I type in the password  <password>
And I click the Login button
Then I should not see an error message of <errorMessage>

Examples:
| username | password | errorMessage |
| "JohnDoe" | null | "Username and/or password is incorrect" |
| null | "password" | "Username and/or password is incorrect" |
| null | null | "Username and/or password is incorrect" |