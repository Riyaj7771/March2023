Feature: Login Functionality

Background: User is successfully LaunchedApplication
When user opens "Chrome" browser with exe as "E:\\March2022FlipkartNew\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user opens URL as "https://www.flipkart.com"

Scenario: Login functionality with valid credentials
When User click on cancle button
When User moveto Login
When User click on Myprofile
When user enter "9028281928" as username
When User enter "Riyaj@7771" as password
When user click on login button
Then Application shows Login successfully


