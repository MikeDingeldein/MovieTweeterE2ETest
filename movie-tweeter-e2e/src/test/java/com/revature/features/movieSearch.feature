Feature: Search

Scenario Outline: Search for a movie (positive test)
Given I am at the search module
When I type in an movie title of <movieName>

And I click the Search button
Then I should see the movie title search results <movieResults>

Examples:
| movieName | 
| "Harry Potter"| 
| "The Matrix" | 
| "Finding Nemo" |

Scenario Outline: Search for a movie (negative test)
Given I am at the search module
When I type in an movie title of <movieName>

And I click the Search button
Then I should not see a result

Examples:
| movieName | 
| null | 
| "bjbkjbj" | 
