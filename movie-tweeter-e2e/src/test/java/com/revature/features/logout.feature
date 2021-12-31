Feature: Logout

Scenario Outline: Logout from Movie Tweeter (positive)
Given I am logged in to Movie Tweeter with <username> and <password>
When I click the logout button
Then I return to the login page

Examples:
| username | password |
| "JohnDoeFake" | "password" |
| "MikeDingeldein" | "wordpass" |

