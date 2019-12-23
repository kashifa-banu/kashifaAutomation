Feature: Demaout submition page
	Scenario: User enters all the fields and submit
	Given User launch the URL and in the submission page
	When user launches the URL and enter contact information
	And  mailing information
	And User information
	And selects the Gender
	And selects the training
	And clicks on submit
	Then an alert should display
