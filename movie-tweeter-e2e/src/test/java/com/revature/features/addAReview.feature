Feature: Add Review

Scenario Outline: Add review for a movie (positive test)
Given I am at the review module
When I type in an movie title of <title>
When I type in an movie imdbID of <imdbID>
When I type in an movie rating of <movieRating>
When I type in an movie rating of <movieReview>
And I click the Submit button
Then I should see the result

Examples:
| title | imdbID | movieRating | movieReview |
| "Harry Potter"| "5" | "Fun" |
| "The Matrix" | "5" | "Super cool!!!!" |
| "Finding Nemo" | "4" | "Watch with the kids" |
| "The Deep House" | "1" | "Aweful! Waste of time." |
| "Inception" | "4" | null |

Scenario Outline: Add review for a movie (negative test)
Given I am at the review module
When I type in an movie imdbID of <imdbID>
When I type in an movie rating of <movieRating>
When I type in an movie rating of <movieReview>
And I click the Submit button
Then I should not see an error message of <errorMessage>

Examples:
| imdbID | movieRating | movieReview | errorMessage |
| null | "4" | "I was confused" | "movie with imdbId does not exist" |
| "Inception" | null | "I was confused" | "Rating must be integer 1-5" |
| "Inception" | "25" | "I was confused" | "Rating must be integer 1-5" |
| "Inception" | "-5" | "I was confused" | "Rating must be integer 1-5" |
