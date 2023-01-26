Feature: Automating the Functionalities of Adactin

Given 

-> Some precondition Step
When

-> Some Key Actions
Then

-> To Verify or Validate Something
And

-> Used to add condition in a feature file

#Scenario: TC01: Verification of Adactin Login
#
#
#Given User Open the Adactin Aplication In Chrome Browser
#Then  User Verify whether the login page is appeared or not
#When  User give Valid username and password then click on the login button
#Then User verify whether the Search Hotel page is Appeard or Not


#Scenario: TC02: Verification of Serach Hotel Page
#
#Given User Open the Adactin Aplication In Chrome Browser
#Then  User Verify whether the login page is appeared or not and pass the information then click on th login button
#When  User giving valid information in the respective row and then click on the search button
#Then  User verify whether the select Hotel page is appear or not  

@Regression
Scenario: TC03: Verification of select Hotel 

Given User Open the Adactin Aplication In Chrome Browser
Then  User Verify whether the login page is appeared or not and pass the information then click on th login button and fill the hotel details and click on the search button
When  User click the select button then click on the search button
Then  User verify whether the Book A Hotel page is appear or not 

@Smoke
Scenario: TC01: Verification of select Hotel 

When  User give Valid username and password then click on the login button
Then  User Verify whether the Search Hotel page is appeared or not
When  User give Valid Information in the respective rows then click on the search button
Then  User Verify whether the Select Hotel page is appeared or not
And   User Select the option given in the page then click on the Continue button
Then  User Verify whether the Book A Hotel page is appeared or not
When  User give the valid information int respecive box then click the Book Now button 


@SanityOne
Scenario: TC01: Login page Verification  

Given User verifying the login page using assert
When  User the give valid username and password using DataTable without header one-D, and click on the login button
#One - D with out Header
|Herbert8489|
|Sam8489752875|
Then  User verify whether the search hotel page is appeard or not 



@SanityTwo
Scenario: TC01: Login page Verification 

Given User verifying the login page using assert
When  User the give valid username and password using DataTable without header Two-D, and click on the login button
#Two - D without Header
|Herbert8489| Wlcome |
|Sam8489752875| Adactin |
Then  User verify whether the search hotel page is appeard or not 


@SanityThree
Scenario: TC01: Login page Verification

Given User verifying the login page using assert
When  User the give valid username and password using DataTable with header one-D, and click on the login button
#One - D with Header
|username| Herbert8489 |
|password| Sam8489752875 |
Then  User verify whether the search hotel page is appeard or not 


@SanityFour
Scenario: TC01: Login page Verification

Given User verifying the login page using assert
When  User the give valid username and password using DataTable with header Two-D, and click on the login button
#Two - D with Header
|username| password |
|Herbert8489| Sam8489752875 |
Then  User verify whether the search hotel page is appeard or not


@SanityFive
Scenario Outline: TC01: Login page Verification

Given User verifying the login page using assert
When  User the give valid "<username>" and "<password>" then click on the login button
Then  User verify whether the search hotel page is appeard or not

Examples:
|username   | password      |
|Herbert8489| Sam8489752875 |
|Herbert8489| Sam8489752875 |
|Herbert8489| Sam8489752875 |

@SanitySix
Scenario Outline: TC01: Adactin Application Verification 

Given User verifying the login page using assert
When  User the give valid "<username>" and "<password>" then click on the login button
Then  User verify whether the search hotel page is appeard or not

Examples:
|username   | password      |Location |Hotels       |Room type|Number of rooms|Adult per Room | Childrens per Room|First Name |Last Name |Billing Address|Credit card no  |Credit card Type|Select month|Select year|CVV number|
|Herbert8489| Sam8489752875 |Sydney   |Hotel Hervey |Double   |1 - One        |1 - One				|1 - One            |Herbert    |Samson    | choolaimedu   |1234567894567895|VISA            |January     | 2020      |423       |
|Herbert8489| Sam8489752875 |Melbourne|Hotel Creek  |Double   |1 - One        |1 - One				|1 - One            |Herbert    |Samson    | choolaimedu   |1234567894567895|VISA            |January     | 2020      |423       |  
|Herbert8489| Sam8489752875 |Brisbane |Hotel Cornice|Double   |1 - One        |1 - One				|1 - One            |Herbert    |Samson    |  choolaimedu  |1234567894567895|VISA            |January     | 2020      |423       |

