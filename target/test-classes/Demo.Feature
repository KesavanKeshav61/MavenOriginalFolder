Feature: To validate the fuctionality of facebook application
Background:
Given To launch the browser and maximize the window
#1
@Regression
Scenario:To validate the login with provide username and password
When To launch the url of the facebook appliaction
When To pass the username in email field
And To pass the password in password field
And  To click the login button
Then To close the browser
#2

@Smoke
Scenario Outline:
To validate the login with provide username and password
When To launch the url of the facebook appliaction
When To pass the username or "<username>" in email field
And To pass the password or "<password>" in password field
Then  To click the login button

Examples:
|username                  |password    |
|kesavanharry6782@gmail.com|kesh@12356  |
|kesavanKeshav@gmail.com   |keshav@63521|
