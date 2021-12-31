Feature: Login

Scenario Outline: Valid password, valid username (positive test)
Given I am at the login page
When I type in a username of <username>
And I type in the password  <password>
And I click the Login button
Then I should be sent to search titles

Examples:
| username | password |
| "JohnDoeFake" | "password" |
| "MikeDingeldein" | "wordpass" |


Scenario: Valid password, invalid username (negative test)
Given I am at the login page
When I type in a username of "vhyibv"
And I type in the password  "password"
And I click the Login button
Then I should be see a message of "Invalid username or password"

Scenario: Invalid password, invalid username (negative test)
Given I am at the login page
When I type in a username of "vhyibv"
And I type in the password  "bkjbh"
And I click the Login button
Then I should be see a message of "Invalid username or password"

Scenario: Invalid password, valid  username (negative test)
Given I am at the login page
When I type in a username of "MikeDingeldein"
And I type in the password  "bkjbh"
And I click the Login button
Then I should be see a message of "Invalid username or password"

