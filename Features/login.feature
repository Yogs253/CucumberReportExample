Feature: Login

@smoke
Scenario Outline: Successful Login
	Given User Launch Chrome Browser
	When User opens URL "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"
	And User enters Email as <username> and Password as <password>
	And Click on Login
	Then Page Title should be "Login in success"
	When User click on Logout link
	Then Page Title should be "Logout success"
	And close browser
	
	Examples:                      		

|username  |password         |		

|testraghu@gmail.com     |passwords          |		

|testraghua@gmail.com     |passworde         |		

|testraghuae@gmail.com     |passworda        |




	