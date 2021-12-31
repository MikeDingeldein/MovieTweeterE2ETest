Feature: Add Review

Scenario Outline: Add review for a movie (positive test)
Given I am at the review module
When I type in an movie imdbID of <imdbID>
When I type in an review title of <title>
When I type in an movie rating of <movieRating>
When I type in an review body of <movieReview>
And I click the Submit button
Then I should see the result

Examples:
| imdbID | title | movieRating | movieReview |
| "tt0241527"| "test" | "5" | "Fun" |
| "tt0365467" |  "test" | "5" | "Super cool!!!!" |
| "tt0266543" |  "test" | "4" | "Watch with the kids" |
| "tt11686490" |  "test" | "1" | "Aweful! Waste of time." |
| "tt1375666" |  "test" | "4" | "test" |

Scenario Outline: Add review for a movie (negative test)
Given I am at the review module
When I type in an movie imdbID of <imdbID>
When I type in an review title of <title>
When I type in an movie rating of <movieRating>
When I type in an review body of <movieReview>
And I click the Submit button
Then I should not see an review error message of <errorMessage>

Examples:
| imdbID |  title | movieRating | movieReview | errorMessage |
| null |  "test" | "4" | "I was confused" | "movie with imdbId does not exist" |
| "tt1375666" |  "test" | null | "I was confused" | "Rating must be integer 1-5" |
| "tt1375666" |  "test" | "25" | "I was confused" | "Rating must be integer 1-5" |
| "tt1375666" |  "test" | "-5" | "I was confused" | "Rating must be integer 1-5" |

