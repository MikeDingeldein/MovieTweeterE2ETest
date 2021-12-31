Feature: Search

Scenario Outline: Search for a movie (positive test)
Given I am at the search module
When I type in an movie title of <movieName>

And I click the Search button
Then I should see the movie title search results <movieResults>

Examples:
| movieName | movieResults |
| "Harry Potter"| "Harry Potter and the Deathly Hallows: Part 2 (2011)" |
| "The Matrix" | "The Matrix (1999)" |
| "Finding Nemo" | "Finding Nemo (2003)" |