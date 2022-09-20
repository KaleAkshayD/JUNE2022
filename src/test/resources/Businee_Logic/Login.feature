Feature: Login functionality

  Background: User Cancelled initial Login Window
    Given User provide browser name as "Chrome" and exeLocation "F:\\Automation Tools n Driver\\chromedriver.exe"
    Given User enter url as"https://www.flipkart.com/"
    Given user Cancel initial Login window

				@SmokeTest
  Scenario: Login functionality with vaild Credential username and password
    When User Click on MyProfile
    When User enter username as "8446501909"
    When User enter password as "8446501909"
    When User Click on Login button
		Then Application shows user profile to user