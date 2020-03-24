@jainbookagency
Feature: Jainbook Website
@TC06_Jainbook
Scenario:
Login to the jainbookagency 
Given the user launch the chrome application for sixth time
When the user opened the jainbookagency Home page
Then the user login using valid username and password
Then click on the Advancesearch
Then logout and close the browser
@TC07_Jainbook
Scenario:
Login and  reset the page
Given user launch the chrome application for seventh time
When the user open the jainbookagency and login into the page
Then the user  enters book name in the text box and click on reset
Then the user logout from the page and close the browser
@TC08_Jainbook
Scenario:
Login and  Search book
Given user launches chrome application for eigth time
When user open  jainbookagency and login into the page
Then the user  fills the details and clicks on search button
Then the user logout the page and close the browser
@TC09_Jainbook
Scenario:
Login and Add to cart
Given launch the chrome application for the nineth time
When  opens the jainbookagency Home page and login into the page
Then the user clicks add to cart
Then logout and Close the browser
@TC010_Jainbook
Scenario:
Login and  click on home page
Given user launching the chrome application for tenth time
When user opening the jainbookagency and login into the page
Then the user clicks on Home
Then  user logout  the page and close the browser