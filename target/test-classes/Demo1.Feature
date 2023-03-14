Feature: To validate the fuctionality of demoqa application
Background:
Given To launch the browser and maximize the window

#2
Scenario Outline:
To validate the login with provide username and password
When To launch the url of the demoqa appliaction
When To pass the firstname"<name>" in field
And To pass the lastname "<names>" in field
When To pass the username "<namez>"in field
And To pass the password"<password>" in field
#And  To click the registration button
#Then To close the browser

Examples:
|name         |names|namez|password|
|kesavan      |Kesahavharry|Kesahav Raj|Bharathi@|


