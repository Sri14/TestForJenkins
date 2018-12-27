Feature: WebRoster basic navigation

Scenario: Navigate to Invoice and Payments and book demo
Given I am on WebRoster homepage
When I click on Products
Then I click on Invoic and Payments
Then I click on book a free online demo
And I fill in Name and Company name and Email and Phonenumber 
Then I click on Data Protection
And I close the Browser


Scenario: Check Webroster imgae is displayed 
Given I am on WebRoster homepage
Then I see the image displayed
And I close the Browser


Scenario Outline: fill in get in touch form
Given I am on WebRoster homepage
When I click on contact tab
Then I fill in "<Name>" and "<Phone>" and "<Email>" 
And I fill in address and tick required boxes
And I close the Browser



Examples: 	
| Name | Phone | Email 		  |
| Sri	| 1234 | test@123.com |
| TOM	| 0000 | test@567.com |

