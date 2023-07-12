@RegisterTest
Feature: Register Page Tests

Background: User is on register page
Given User navigates to the register page


Scenario: User register with valid data
When User enters required data
|testfName1|testlName1|testmail432@abc.com|testAddress|testCity|Karnataka|123456|India|testLoginName432|Test@123|Test@123|
And Submit it
Then Account should be created successfully


Scenario: User register with invalid data
When User enters required data
|thisIsTestDataWithMoreThan32Characters|thisIsTestDataWithMoreThan32Characters|testmail1334@abc|ab|ab|Karnataka|12|India|test|abc|abc|
And Submit it
Then Error message should appear about valid format


Scenario: User failed to enter any data
When User enters required data
|testfName1|testlName1|testmail1334@abc.com|testAddress|testCity|Karnataka|123456|India|testLoginName1334|Test@123|Test@123|
And Submit it
Then Proper error message should appear about the empty data
    

Scenario: User enters already registered email
When User enters required data
|testfName1|testlName1|testmail1334@abc.com|testAddress|testCity|Karnataka|123456|India|testLoginName1334|Test@123|Test@123|
And Submit it
Then Proper error message should appear about email address


Scenario: User enters already registered login name
When User enters required data
|testfName1|testlName1|testmail1334@abc.com|testAddress|testCity|Karnataka|123456|India|testLoginName1334|Test@123|Test@123|
And Submit it
Then Proper error message should appear about login name