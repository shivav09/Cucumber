Feature: Login
Background:
Then User home page displayed "<name>"


#HOme
@Success
Scenario: HOme page
Then User home page displayed

@Shiva
Scenario Outline: Sample scenario from feature file 1
Given User enters URL "<name>"
Examples:
|name|
|shiva|
|prasad|



