Feature: Manage Address Functionality

Background: User is successfully LaunchedApplication
When user opens "Chrome" browser with exe as "E:\\March2022FlipkartNew\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user opens URL as "https://www.flipkart.com/"
When user click on cancle button
When user moveto Login
When user click on Myprofile
When user enter "9028281928" as username
When user enter "Riyaj@7771" as password
When user click on login button
Then Application shows Login successfully

@RegressionTest
Scenario Outline: Validation manage address functionality
When user click on Manage Addresses
When user click on Add New Address
When user enter Name as <Name>
When user enter Mobile number as <Number>
When user enter Pincode as <pinNumber>
When user enter Locality as <locality>
When user enter Address as <Address>
When user click on HOME button
When user click on Save button
Then user click on save button
Then Application shows Manage Address Sucessfully filled
When delete save address

Examples:
|Name|Number|pinNumber|locality|Address
|Riyaj|9028281928|413702|Ahmednagar|At/P:Shrigonda
|sagar|7397807723|414014|Pune|At/P:Loni
|Swapnil|9421918634|412207|Pune|At/P:Wagholi